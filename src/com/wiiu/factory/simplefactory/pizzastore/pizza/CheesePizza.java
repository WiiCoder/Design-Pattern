package com.wiiu.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName CheesePizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/15 11:19 上午
 * @Version 1.0
 */

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super.setName("CheesePizza");
    }

    @Override
    public void prepare() {
        System.out.println("准备奶酪披萨原材料");
    }

}
