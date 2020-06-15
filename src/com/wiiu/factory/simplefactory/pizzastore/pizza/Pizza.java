package com.wiiu.factory.simplefactory.pizzastore.pizza;

/**
 * @ClassName Pizza
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/15 11:12 上午
 * @Version 1.0
 */

public abstract class Pizza {

    protected String name;

    // 准备原材料，不同的披萨不一样，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking;");
    }

    public void cut() {
        System.out.println(name + "cut");
    }

    public void box() {
        System.out.println(name + "boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
