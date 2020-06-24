package com.wiiu.adapter.objadapter;

/**
 * @ClassName VoltageAdapter
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/24 4:20 下午
 * @Version 1.0
 */

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            System.out.println("适配中～");
            return voltage220V.output220V()/44;
        }
        return  dst;
    }

    public VoltageAdapter(Voltage220V v) {
        this.voltage220V = v;
    }
}
