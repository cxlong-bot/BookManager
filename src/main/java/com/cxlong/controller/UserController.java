package com.cxlong.controller;

import com.cxlong.domain.Global;
import com.cxlong.domain.ResponseResult;
import com.cxlong.domain.User;
import com.cxlong.exception.BusinessException;
import com.cxlong.service.inter.UserService;
import com.cxlong.util.CountHolder;
import com.cxlong.util.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: long
 * @date: 2021/4/29 22:11
 * @description: 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private ResponseResult result;

    /*
        用户登录入口
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult userLogin(HttpServletRequest request, HttpServletResponse response) throws Exception{
        User user = JSONUtil.read(request.getInputStream(),User.class);
        user = userService.findUser(user);
        if(user == null) {
            throw new BusinessException("00001","没有此用户哦");
        }
        //登录成功记录用户，存放入session
        request.getSession().setAttribute(Global.USER_SESSION_KEY,user);
        return result;
    }

    /*
        用户注册入口
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseResult userRegister(HttpServletRequest request, HttpServletResponse response) throws Exception{
        User user = JSONUtil.read(request.getInputStream(), User.class);
        userService.addUser(user);
        return result;
    }

    /*
        用户注销入口
     */
    @RequestMapping(value = "logout")
    @ResponseBody
    public ResponseResult userLogout(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //注销清除session中的user
        request.getSession().setAttribute(Global.USER_SESSION_KEY,null);
        return result;
    }
}
