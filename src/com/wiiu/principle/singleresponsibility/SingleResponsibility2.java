package com.wiiu.principle.singleresponsibility;

/**
 * @ClassName SingleResponsibility1
 * @Author dicoholic
 * @Date 2020/6/9 4:23 下午
 * @Version 1.0
 */

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("潜艇");
    }

}

//  方法2
//  这种方法的开销太大
//

class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上运行......");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上运行......");
    }
}

class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行......");
    }
}
