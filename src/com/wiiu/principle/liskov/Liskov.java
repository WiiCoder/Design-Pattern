package com.wiiu.principle.liskov;

/**
 * @ClassName Liskov
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/11 3:29 下午
 * @Version 1.0
 */

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("----------------------");
        B b = new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+1="+b.func2(11,3));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class B extends A {
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1,int num2) {
        return func1(num1,num2)+1;
    }
}
