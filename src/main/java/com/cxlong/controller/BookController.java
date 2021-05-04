package com.cxlong.controller;

import com.cxlong.domain.ResponseResult;
import com.cxlong.service.inter.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: long
 * @date: 2021/5/2 17:20
 * @description: 书籍控制器
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;
    @Resource
    private ResponseResult result;

    /*
        图书字典入口
     */
    @RequestMapping("/queryAsDict")
    @ResponseBody
    public ResponseResult queryBookAsDict(HttpServletRequest request, HttpServletResponse response){
        result.setData(bookService.queryBookAsDict());
        return result;
    }
}
