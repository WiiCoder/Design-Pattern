package com.wiiu.adapter.objadapter;

/**
 * @ClassName client
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/24 4:28 下午
 * @Version 1.0
 */

public class client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
