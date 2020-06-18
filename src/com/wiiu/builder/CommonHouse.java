package com.wiiu.builder;

/**
 * @ClassName CommonHouse
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 4:38 下午
 * @Version 1.0
 */

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
