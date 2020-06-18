package com.wiiu.factory.absfactory.pizzastore.pizza;

/**
 * @ClassName LondonPeeperPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:03 上午
 * @Version 1.0
 */

public class LondonPeeperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("伦敦胡椒披萨");
        System.out.println("给伦敦胡椒披萨一杯卡布奇");
    }
}
