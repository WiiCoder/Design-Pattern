package com.wiiu.factory.factorymethod.pizzastore.order;

import com.wiiu.factory.factorymethod.pizzastore.pizza.LondonCheesePizza;
import com.wiiu.factory.factorymethod.pizzastore.pizza.LondonPeeperPizza;
import com.wiiu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName LondanOrderPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:10 上午
 * @Version 1.0
 */

public class LondanOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new LondonCheesePizza();
        } else if (type.equals("peeper")) {
            pizza = new LondonPeeperPizza();
        }
        return pizza;
    }
}
