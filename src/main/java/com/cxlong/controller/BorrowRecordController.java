package com.cxlong.controller;

import com.cxlong.domain.BorrowRecord;
import com.cxlong.domain.Page;
import com.cxlong.domain.ResponseResult;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.BorrowRecordService;
import com.cxlong.util.CountHolder;
import com.cxlong.util.JSONUtil;
import com.cxlong.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 10:37
 * @description: 借阅信息控制器
 */
@Controller
@RequestMapping("/borrowRecord")
public class BorrowRecordController {
    @Resource
    private BorrowRecordService borrowRecordService;
    @Resource
    private ResponseResult result;

    /*
        查询所有入口
     */
    @RequestMapping("/query")
    @ResponseBody
    public ResponseResult queryBorrowRecord(HttpServletRequest request, HttpServletResponse response){
        Page p = Util.parse(request);
        List<BorrowRecord> borrowRecordList = borrowRecordService.queryBorrowRecord(p);
        result.setTotal(CountHolder.get());//可能是分页的接口，get可以获取到值，也可能不是，返回null。
        result.setData(borrowRecordList);
        return result;
    }

    /*
        id查询入口
     */
    @RequestMapping("/queryById")
    @ResponseBody
    public ResponseResult queryBorrowRecordById(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        result.setData(borrowRecordService.queryBorrowRecordById(id));
        return result;
    }

    /*
        添加入口
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResponseResult addBorrowRecord(HttpServletRequest request, HttpServletResponse response) throws Exception {
        BorrowRecord record = JSONUtil.read(request.getInputStream(),BorrowRecord.class);
        borrowRecordService.addBorrowRecord(record);
        return result;
    }

    /*
        修改入口
     */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseResult updateBorrowRecord(HttpServletRequest request, HttpServletResponse response) throws Exception {
        BorrowRecord record = JSONUtil.read(request.getInputStream(),BorrowRecord.class);
        borrowRecordService.updateBorrowRecord(record);
        return result;
    }

    /*
        删除入口
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseResult deleteBorrowRecord(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("ids");
        borrowRecordService.deleteBorrowRecord(ids);
        return result;
    }
}
