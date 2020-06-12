package com.wiiu.singleton.type1;

/**
 * @ClassName SingletonTest1
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 4:17 下午
 * @Version 1.0
 */

public class SingletonTest1 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode()+":"+instance1.hashCode());
    }
}


// 饿汉式（静态变量）
class Singleton {

    private Singleton() {}

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}