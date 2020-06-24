package com.wiiu.adapter.classadapter;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/24 4:20 下午
 * @Version 1.0
 */

public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5){
            System.out.println("可以充电,此时电压为：" + iVoltage5V.output5V() );
        } else {
            System.out.println("请勿充电,此时电压为：" + iVoltage5V.output5V());
        }
    }

}
