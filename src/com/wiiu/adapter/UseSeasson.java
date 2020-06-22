package com.wiiu.adapter;

/**
 * @ClassName UseSeasson
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/22 4:08 下午
 * @Version 1.0
 */

public class UseSeasson {

    public String getChineseSeason(Seasson seasson){
        StringBuffer result = new StringBuffer();
        switch (seasson){
            case SPRING:
                result.append("[中文：春天，枚举常量："+ seasson.name() + ",数据:" + seasson.getCode() + "]");
                break;
            case SUMMER:
                result.append("[中文：夏天，枚举常量："+ seasson.name() + ",数据:" + seasson.getCode() + "]");
                break;
            case AUTUMN:
                result.append("[中文：秋天，枚举常量："+ seasson.name() + ",数据:" + seasson.getCode() + "]");
                break;
            case WINTER:
                result.append("[中文：冬天，枚举常量："+ seasson.name() + ",数据:" + seasson.getCode() + "]");
                break;
            default:
                result.append("这是没有季节的一天" + seasson.name());
                break;
        }
        return result.toString();
    }

    public void doSomething(){
        for (Seasson s: Seasson.values()){
            System.out.println(getChineseSeason(s));
        }

    }

    public static void main(String[] args) {
        UseSeasson useSeasson = new UseSeasson();
        useSeasson.doSomething();
    }
}

enum Color {
    RED("红色",1),GREEN("绿色",2);
    private String name;
    private int index;
    private Color(String name, int idnex){
        this.name = name;
        this.index = index;
    }
}
