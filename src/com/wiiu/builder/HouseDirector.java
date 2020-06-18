package com.wiiu.builder;

/**
 * @ClassName HouseDirector
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 4:46 下午
 * @Version 1.0
 */

public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House builder() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
