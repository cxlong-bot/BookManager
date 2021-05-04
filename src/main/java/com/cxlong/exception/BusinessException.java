package com.cxlong.exception;


/**
 * @author: long
 * @date: 2021/5/1 11:06
 * @description: 业务异常类
 */
public class BusinessException extends BaseException {

    public BusinessException(String code, String message) {
        super("BUS"+code, "业务异常: "+message);
    }

    public BusinessException(String code, String message, Throwable cause) {
        super("BUS"+code, "业务异常: "+message, cause);
    }
}
