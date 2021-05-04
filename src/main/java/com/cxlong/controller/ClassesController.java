package com.cxlong.controller;

import com.cxlong.domain.Classes;
import com.cxlong.domain.Page;
import com.cxlong.domain.ResponseResult;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.ClassesService;
import com.cxlong.util.CountHolder;
import com.cxlong.util.JSONUtil;
import com.cxlong.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: long
 * @date: 2021/5/2 17:08
 * @description: 班级控制器
 */
@Controller
@RequestMapping("/classes")
public class ClassesController {
    @Resource
    private ClassesService classesService;
    @Resource
    private ResponseResult result;

    /*
        班级字典入口
     */
    @RequestMapping("/queryAsDict")
    @ResponseBody
    public ResponseResult queryClassesAsDict(HttpServletRequest request, HttpServletResponse response){
        result.setData(classesService.queryClassesAsDict());
        return result;
    }

    /*
        查询所有入口
     */
    @RequestMapping("/query")
    @ResponseBody
    public ResponseResult queryClasses(HttpServletRequest request, HttpServletResponse response){
        Page p = Util.parse(request);
        List<Classes> classesList = classesService.queryClasses(p);
        result.setTotal(CountHolder.get());//可能是分页的接口，get可以获取到值，也可能不是，返回null。
        result.setData(classesList);
        return  result;
    }

    /*
        id查询入口
     */
    @RequestMapping("/queryById")
    @ResponseBody
    public ResponseResult queryClassesById(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        result.setData(classesService.queryClassesById(id));
        return result;
    }

    /*
        添加入口
     */
    @RequestMapping("/add")
    @ResponseBody
    public ResponseResult addClasses(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Classes classes = JSONUtil.read(request.getInputStream(),Classes.class);
        classesService.addClasses(classes);
        return  result;
    }

    /*
        修改入口
     */
    @RequestMapping("/update")
    @ResponseBody
    public ResponseResult updateClasses(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Classes classes = JSONUtil.read(request.getInputStream(),Classes.class);
        classesService.updateClasses(classes);
        return result;
    }

    /*
        删除入口
     */
    @RequestMapping("/delete")
    @ResponseBody
    public ResponseResult deleteClasses(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("ids");
        classesService.deleteClasses(ids);
        return  result;
    }
}
