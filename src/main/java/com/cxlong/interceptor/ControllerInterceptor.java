package com.cxlong.interceptor;

import com.cxlong.domain.Global;
import com.cxlong.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: long
 * @date: 2021/5/1 11:19
 * @description: 拦截器
 */
public class ControllerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");
        //针对响应体设置编码
        response.setCharacterEncoding("UTF-8");
        //设置响应
        response.setContentType("application/json");
        //登录验证
        User user = (User)request.getSession().getAttribute(Global.USER_SESSION_KEY);
        //登录界面判定放行
        if(request.getRequestURI().indexOf("login") != -1)
            return true;
        if(user != null)
            return true;
        else
            return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
