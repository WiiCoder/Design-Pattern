package com.wiiu.builder;

/**
 * @ClassName HouseBuilder
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 4:36 下午
 * @Version 1.0
 */

public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
