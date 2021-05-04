package com.cxlong.exception;

/**
 * @author: long
 * @date: 2021/5/1 11:09
 * @description: 客户端异常类
 */
public class ClientException extends BaseException {

    public ClientException(String code, String message) {
        super("CLI"+code, "客户端错误"+message);
    }

    public ClientException(String code, String message, Throwable cause) {
        super("CLI"+code, "客户端错误"+message, cause);
    }
}
