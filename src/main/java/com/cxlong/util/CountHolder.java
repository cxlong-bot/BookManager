package com.cxlong.util;


public class CountHolder {
    private static final ThreadLocal<Integer> COUNT = new ThreadLocal<>();

    public static void set(Integer count){
        COUNT.set(count);
    }
    public static Integer get(){
        return COUNT.get();
    }
    public static void remove(){
        COUNT.remove();
    }
}
