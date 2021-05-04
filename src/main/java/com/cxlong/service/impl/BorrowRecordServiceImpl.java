package com.cxlong.service.impl;

import com.cxlong.dao.BorrowRecordDao;
import com.cxlong.domain.BorrowRecord;
import com.cxlong.domain.Page;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.BorrowRecordService;
import com.cxlong.util.CountHolder;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 10:35
 * @description: 借阅信息服务对象
 */
@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
    @Resource
    private BorrowRecordDao borrowRecordDao;

    /*
        记录所有记录条数，根据分页信息分页查询
     */
    @Override
    public List<BorrowRecord> queryBorrowRecord(Page page) {
        CountHolder.set(borrowRecordDao.selectBorrowRecord().size());
        PageHelper.startPage(page.getPageNumber(), page.getPageSize());
        List<BorrowRecord> borrowRecordList = borrowRecordDao.selectBorrowRecord();
        return borrowRecordList;
    }

    /*
        根据id查询借阅信息
     */
    @Override
    public BorrowRecord queryBorrowRecordById(int id) {
        return borrowRecordDao.selectBorrowRecordById(id);
    }

    /*
        添加借阅信息，配置事物，发生异常回滚
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int addBorrowRecord(BorrowRecord borrowRecord) throws Exception{
        int num = borrowRecordDao.insertBorrowRecord(borrowRecord);
        if(num != 1)
            throw new BusinessException("00043","插入图书借阅信息异常");
        return num;
    }

    /*
        修改借阅信息，配置事物，发生异常回滚
    */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int updateBorrowRecord(BorrowRecord borrowRecord) throws Exception{
        int num = borrowRecordDao.updateBorrowRecord(borrowRecord);
        if(num != 1)
            throw new BusinessException("00044","修改图书借阅信息异常");
        return num;
    }

    /*
        删除借阅信息，配置事物，发生异常回滚
    */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public int deleteBorrowRecord(String[] ids) throws Exception {
       int num = borrowRecordDao.deleteBorrowRecord(ids);
       if(num != ids.length)
           throw new BusinessException("00045","删除图书借阅信息异常");
       return num;
    }
}
