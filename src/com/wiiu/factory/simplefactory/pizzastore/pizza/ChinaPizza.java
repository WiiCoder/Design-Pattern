package com.wiiu.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName ChinaPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 10:40 上午
 * @Version 1.0
 */

public class ChinaPizza extends Pizza {

    public ChinaPizza() {
        super.setName("China");
    }

    @Override
    public void prepare() {
        System.out.println("给国产披萨一杯卡布奇诺");
    }
}
