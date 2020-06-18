package com.wiiu.builder;

/**
 * @ClassName Client
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 4:49 下午
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.builder();
        houseDirector.setHouseBuilder(new HightHouse());
        houseDirector.builder();
    }
}
