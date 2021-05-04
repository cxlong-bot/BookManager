package com.cxlong.controller;

import com.cxlong.domain.ResponseResult;
import com.cxlong.service.inter.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: long
 * @date: 2021/5/3 10:21
 * @description: 学生控制器
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private ResponseResult result;

    /*
        学生字典入口
     */
    @RequestMapping("/queryAsDict")
    @ResponseBody
    public ResponseResult queryStudentAsDict(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("dictionaryKey"));
        result.setData(studentService.queryStudentAsDict(id));
        return result;
    }
}
