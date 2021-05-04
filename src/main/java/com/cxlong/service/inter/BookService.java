package com.cxlong.service.inter;

import com.cxlong.domain.Book;

import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:18
 * @description: 图书服务接口
 */
public interface BookService {
    /*
        查询所有图书作为字典
     */
    List<Book> queryBookAsDict();

    /*
        查询所有图书
     */
    List<Book> queryBook();
}
