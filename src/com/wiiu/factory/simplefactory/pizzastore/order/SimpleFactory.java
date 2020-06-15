package com.wiiu.factory.simplefactory.pizzastore.order;

import com.wiiu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.wiiu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.wiiu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @ClassName SimpleFactory
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/15 2:14 下午
 * @Version 1.0
 */

public class SimpleFactory {

    public Pizza createPizza(String type) {
        System.out.println("Simple Factory");

        Pizza pizza = null;

        if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }

        return pizza;
    }

}
