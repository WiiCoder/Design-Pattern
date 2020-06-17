package com.wiiu.factory.factorymethod.pizzastore.pizza;

/**
 * @ClassName BJPeeperPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:02 上午
 * @Version 1.0
 */

public class BJPeeperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("北京胡椒披萨");
        System.out.println("给北京胡椒披萨一杯卡布奇");
    }
}
