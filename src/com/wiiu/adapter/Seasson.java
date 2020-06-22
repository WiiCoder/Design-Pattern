package com.wiiu.adapter;

/**
 * @ClassName Seasson
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/22 4:06 下午
 * @Version 1.0
 */

public enum  Seasson {

    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

    private int code;
    private Seasson(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
