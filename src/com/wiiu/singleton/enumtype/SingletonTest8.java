package com.wiiu.singleton.enumtype;

/**
 * @ClassName SingletonTest8
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 5:59 下午
 * @Version 1.0
 */

public class SingletonTest8 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance.hashCode()+":"+instance1.hashCode());

        instance.sayOK();
        instance1.sayOK();
    }
}

enum Singleton {
    INSTANCE;

    public void sayOK() {
        System.out.println("ok");
    }
}

