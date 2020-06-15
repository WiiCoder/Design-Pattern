package com.wiiu.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName GreekPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/15 11:21 上午
 * @Version 1.0
 */

public class GreekPizza extends Pizza {
    public GreekPizza() {
        super.setName("GreekPizza");
    }

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
