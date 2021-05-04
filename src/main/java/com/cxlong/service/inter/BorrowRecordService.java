package com.cxlong.service.inter;

import com.cxlong.domain.BorrowRecord;
import com.cxlong.domain.Page;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 10:34
 * @description: 借阅信息服务接口
 */
public interface BorrowRecordService {
    /*
        分页查询借阅信息
     */
    List<BorrowRecord> queryBorrowRecord(Page page);

    /*
        根据id查询借阅信息
     */
    BorrowRecord queryBorrowRecordById(int id);

    /*
        添加借阅信息
     */
    int addBorrowRecord(BorrowRecord borrowRecord) throws Exception;

    /*
        修改借阅信息
     */
    int updateBorrowRecord(BorrowRecord borrowRecord) throws Exception;

    /*
        批量删除借阅信息
     */
    int deleteBorrowRecord(String[] ids) throws Exception;
}
