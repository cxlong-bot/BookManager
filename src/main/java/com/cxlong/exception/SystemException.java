package com.cxlong.exception;

/**
 * @author: long
 * @date: 2021/5/1 11:10
 * @description: 系统异常类
 */
public class SystemException extends BaseException {

    public SystemException(String code, String message) {
        super("SYS"+code, "系统错误"+message);
    }

    public SystemException(String code, String message, Throwable cause) {
        super("SYS"+code, "系统错误"+message, cause);
    }
}
