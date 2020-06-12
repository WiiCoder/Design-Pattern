package com.wiiu.singleton.doublecheck;

/**
 * @ClassName SingletonTest6
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 5:22 下午
 * @Version 1.0
 */

public class SingletonTest6 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode()+":"+instance1.hashCode());
    }
}

class Singleton {

    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized(Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

