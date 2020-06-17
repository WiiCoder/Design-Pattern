package com.wiiu.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName LondonCheesePizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:03 上午
 * @Version 1.0
 */

public class LondonCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("伦敦奶酪披萨");
        System.out.println("给伦敦奶酪披萨一杯卡布奇");
    }
}
