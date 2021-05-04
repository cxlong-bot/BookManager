package com.cxlong.exception;

/**
 * @author: long
 * @date: 2021/5/1 9:53
 * @description: 基本异常类
 */
public class BaseException extends RuntimeException {
    protected String code;
    public BaseException(String code, String message){
        super(message);
        this.code = code;
    }

    public BaseException(String code, String message, Throwable cause){
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
