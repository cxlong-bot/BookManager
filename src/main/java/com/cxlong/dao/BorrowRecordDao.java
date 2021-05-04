package com.cxlong.dao;

import com.cxlong.domain.BorrowRecord;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 9:26
 * @description: 借阅信息持久层
 */
public interface BorrowRecordDao {
    /*
        查询所有借阅信息sql
     */
    List<BorrowRecord> selectBorrowRecord();

    /*
        根据id查询借阅信息sql
     */
    BorrowRecord selectBorrowRecordById(int id);

    /*
        插入借阅信息sql
     */
    int insertBorrowRecord(BorrowRecord borrowRecord);

    /*
        更新借阅信息sql
     */
    int updateBorrowRecord(BorrowRecord borrowRecord);

    /*
        根据id数组删除借阅信息sql
     */
    int deleteBorrowRecord(String[] ids);
}
