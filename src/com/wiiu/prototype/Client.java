package com.wiiu.prototype;

/**
 * @ClassName Client
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 2:56 下午
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        Sheep friend = new Sheep("jack", 2, "黑色");
        Sheep sheep = new Sheep("tom", 1, "白色",friend);
        Sheep clone1 = (Sheep) sheep.clone();
        Sheep clone2 = (Sheep) sheep.clone();
        Sheep clone3 = (Sheep) sheep.clone();
        Sheep clone4 = (Sheep) sheep.clone();
        Sheep clone5 = (Sheep) sheep.clone();
        System.out.println(clone1+",friend:"+clone1.getFriend().hashCode());
        System.out.println(clone2+",friend:"+clone2.getFriend().hashCode());
        System.out.println(clone3+",friend:"+clone3.getFriend().hashCode());
        System.out.println(clone4+",friend:"+clone4.getFriend().hashCode());
        System.out.println(clone5+",friend:"+clone5.getFriend().hashCode());
    }
}
