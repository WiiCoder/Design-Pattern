package com.wiiu.adapter.classadapter;

/**
 * @ClassName VoltageAdapter
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/24 4:20 下午
 * @Version 1.0
 */

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        return super.output220V()/44;
    }
}
