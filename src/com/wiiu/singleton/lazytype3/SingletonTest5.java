package com.wiiu.singleton.lazytype3;

/**
 * @ClassName SingletonTest5
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 5:22 下午
 * @Version 1.0
 */

public class SingletonTest5 {
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
            synchronized(Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}

