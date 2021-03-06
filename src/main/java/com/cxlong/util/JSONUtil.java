package com.cxlong.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;


public class JSONUtil {
    private static ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    }
    //读取输入流的json数据，反序列化为对象，
    // 泛型的操作：<T>方法上定义泛型类型，返回值和传入参数都可以使用泛型
    public static <T> T read(InputStream is, Class<T> clazz){
        try {
            return MAPPER.readValue(is,clazz);
        } catch (IOException e) {
            //throw new SystemException("000003","http请求,解析json数据出错",e);
            throw new NullPointerException();
        }
    }
    public static String write(Object o){
        try {
            return MAPPER.writerWithDefaultPrettyPrinter().writeValueAsString(o);
        } catch (JsonProcessingException e) {
           //throw new SystemException("000004","json序列化对象出错："+o,e);
            throw new NullPointerException();
        }
    }
}
