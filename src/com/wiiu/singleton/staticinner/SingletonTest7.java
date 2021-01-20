package com.wiiu.singleton.staticinner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

/**
 * @ClassName SingletonTest7
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/12 5:43 下午
 * @Version 1.0
 */

public class SingletonTest7 {
    public static void main(String[] args) {
//        Singleton instance = Singleton.getInstance();
//        Singleton instance1 = Singleton.getInstance();
//        System.out.println(instance.hashCode()+":"+instance1.hashCode());
        long start = LocalDateTime.of(LocalDate.now(), LocalTime.MIN).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        long startHistory =
                LocalDateTime.of(LocalDate.now().plusYears(-10L), LocalTime.MIN).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(startHistory);
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
