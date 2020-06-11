package com.wiiu.principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility1
 * @Author dicoholic
 * @Date 2020/6/9 4:23 下午
 * @Version 1.0
 */

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("摩托");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

//  方法3
//  1.这种修改只是在原来的类上增加方法
//  2。这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责

class Vehicle2 {
    public void runRoad(String vehicle) {
        System.out.println(vehicle + "在路上运行......");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行......");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行......");
    }
}
