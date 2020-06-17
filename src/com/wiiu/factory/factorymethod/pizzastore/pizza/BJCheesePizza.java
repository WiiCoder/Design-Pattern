package com.wiiu.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName BJCheesePizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:00 上午
 * @Version 1.0
 */

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("北京奶酪披萨");
        System.out.println("给北京奶酪披萨一杯卡布奇诺");
    }
}
