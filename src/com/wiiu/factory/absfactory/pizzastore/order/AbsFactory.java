package com.wiiu.factory.absfactory.pizzastore.order;

import com.wiiu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @ClassName AbsFactory
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 1:45 下午
 * @Version 1.0
 */

public interface AbsFactory {

    Pizza createPizza(String orderType);
}
