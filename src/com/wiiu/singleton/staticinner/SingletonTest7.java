package com.wiiu.singleton.staticinner;

/**
 * @ClassName SingletonTest7
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 5:43 下午
 * @Version 1.0
 */

public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance.hashCode()+":"+instance1.hashCode());
    }
}

class Singleton {
    private Singleton(){}

    private static class SingletonInstance {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
