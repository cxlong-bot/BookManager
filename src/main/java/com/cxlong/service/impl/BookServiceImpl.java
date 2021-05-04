package com.cxlong.service.impl;

import com.cxlong.dao.BookDao;
import com.cxlong.domain.Book;
import com.cxlong.service.inter.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:19
 * @description: 图书服务对象
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    /*
        查询所有图书作为字典
     */
    @Override
    public List<Book> queryBookAsDict() {
        return bookDao.selectBookAsDict();
    }

    /*
        查询所有图书
     */
    @Override
    public List<Book> queryBook() {
        return bookDao.selectBook();
    }
}
