package com.cxlong.handler;

import com.cxlong.domain.ResponseResult;
import com.cxlong.exception.BaseException;
import com.cxlong.util.JSONUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author: long
 * @date: 2021/5/1 9:37
 * @description: 全局异常处理
 */
@ControllerAdvice()
public class ControllerHandler {
    private ResponseResult result = new ResponseResult();

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public void exceptionHandler(Exception e, HttpServletResponse response) throws IOException {
        e.printStackTrace();
        if(e instanceof BaseException){
            BaseException be = (BaseException)e;
            result.setCode(be.getCode());
            result.setMessage(be.getMessage());
        }else {
            result.setCode("500");
            result.setMessage("未知的错误");
        }
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        result.setStackTrace(sw.toString());
        pw = response.getWriter();
        pw.println(JSONUtil.write(result));
        pw.flush();
        pw.close();
    }

}
