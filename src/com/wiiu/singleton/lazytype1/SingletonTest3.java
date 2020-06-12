package com.wiiu.singleton.lazytype1;

/**
 * @ClassName SingletonTest3
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 4:55 下午
 * @Version 1.0
 */

public class SingletonTest3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode()+":"+instance1.hashCode());
    }
}

class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
