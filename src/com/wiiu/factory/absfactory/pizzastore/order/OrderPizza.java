package com.wiiu.factory.absfactory.pizzastore.order;

import com.wiiu.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/17 1:50 下午
 * @Version 1.0
 */

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
    }

    public void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;

        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败，没有这种披萨，🍕，走你");
                break;
            }
        }while (true);

    }

    // 获取客户订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
