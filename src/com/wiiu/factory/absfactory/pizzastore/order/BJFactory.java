package com.wiiu.factory.absfactory.pizzastore.order;

import com.wiiu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.wiiu.factory.absfactory.pizzastore.pizza.BJPeeperPizza;
import com.wiiu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName BJFactory
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 1:46 下午
 * @Version 1.0
 */

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "cheese":
                pizza = new BJCheesePizza();
                break;
            case "pepper":
                pizza = new BJPeeperPizza();
                break;
        }
        return pizza;
    }
}
