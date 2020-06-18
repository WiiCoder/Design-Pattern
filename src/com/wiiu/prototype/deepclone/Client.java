package com.wiiu.prototype.deepclone;

/**
 * @ClassName Client
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/18 3:25 下午
 * @Version 1.0
 */

public class Client {

    public static void main(String[] args) throws Exception {
        DeepProtoType p = new DeepProtoType();
        p.name = "1111";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");

        //方式1
//        DeepProtoType p2 = (DeepProtoType) p.clone();

        DeepProtoType deepProtoType = (DeepProtoType) p.deepClone();
        System.out.println(p.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType.deepCloneableTarget.hashCode());
    }
}
