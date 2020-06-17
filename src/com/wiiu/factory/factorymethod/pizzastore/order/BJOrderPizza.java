package com.wiiu.factory.factorymethod.pizzastore.order;

import com.wiiu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.wiiu.factory.factorymethod.pizzastore.pizza.BJPeeperPizza;
import com.wiiu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @ClassName BJOrderPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 11:04 上午
 * @Version 1.0
 */

public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if(type.equals("pepper")) {
            pizza = new BJPeeperPizza();
        }
        return pizza;
    }
}
