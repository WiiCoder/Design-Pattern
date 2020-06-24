package com.wiiu.adapter.objadapter;

/**
 * @ClassName Voltage220V
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/24 4:18 下午
 * @Version 1.0
 */

public class Voltage220V {

    public int output220V() {
        int src = 700;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
