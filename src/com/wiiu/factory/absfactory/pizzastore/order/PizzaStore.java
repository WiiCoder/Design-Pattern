package com.wiiu.factory.absfactory.pizzastore.order;

/**
 * @ClassName PizzaStore
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 1:55 下午
 * @Version 1.0
 */

public class PizzaStore {

    public static void main(String[] args) {
        BJFactory bjFactory = new BJFactory();
        LondonFactory londonFactory = new LondonFactory();
        new OrderPizza(bjFactory);
    }
}
