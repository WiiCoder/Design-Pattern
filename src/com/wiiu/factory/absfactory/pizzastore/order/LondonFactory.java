package com.wiiu.factory.absfactory.pizzastore.order;

import com.wiiu.factory.absfactory.pizzastore.pizza.*;

/**
 * @ClassName BJFactory
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 1:46 下午
 * @Version 1.0
 */

public class LondonFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "cheese":
                pizza = new LondonCheesePizza();
                break;
            case "pepper":
                pizza = new LondonPeeperPizza();
                break;
        }
        return pizza;
    }
}
