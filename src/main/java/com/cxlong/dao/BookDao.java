package com.cxlong.dao;

import com.cxlong.domain.Book;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:15
 * @description: 图书类持久层
 */
public interface BookDao {
    /*
        查询所有图书作为字典sql
     */
    List<Book> selectBookAsDict();

    /*
        查询所有图书sql
     */
    List<Book> selectBook();
}
