package com.wiiu.factory.simplefactory.pizzastore.order;

import com.wiiu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.wiiu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.wiiu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName OrderPizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/15 11:22 上午
 * @Version 1.0
 */

public class OrderPizza {

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//            } else {
//                break;
//            }
//            // 输出pizza 制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String type = "";
        this.simpleFactory = simpleFactory;
        do {
            type = getType();
            pizza = this.simpleFactory.createPizza(type);
            if (pizza != null){
                System.out.println("订购成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败,没有对应的pizza种类");
                break;
            }
        } while (true);
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
