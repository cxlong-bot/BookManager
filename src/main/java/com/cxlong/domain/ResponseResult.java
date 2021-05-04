package com.cxlong.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author: long
 * @date: 2021/4/29 22:11
 * @description: 响应结果类
 */

/**
 * http请求返回响应的统一格式
 * 具体需要的字段，是前端后端约定好的，
 * 使用注解自动创建对象并且赋予部分属性
 */
@Component("result")
public class ResponseResult {

    @Value("true")
    private boolean success;//前端响应状态码为200,但是success可以为false
    @Value("200")
    private String code;//自定义的消息编码
    @Value("操作成功")
    private String message;//自定义的消息内容
    private Integer total;//分页需要的字段：查询总的行数（不是分页的数量）
    private Object data;//业务数据
    private String stackTrace;//出现异常时的堆栈信息

    public ResponseResult() {
    }

    public ResponseResult(boolean success, String code, String message, Integer total, Object data, String stackTrace) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.total = total;
        this.data = data;
        this.stackTrace = stackTrace;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }
}

