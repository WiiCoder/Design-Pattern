package com.wiiu.principle.dependenceInversion;

/**
 * @ClassName DependenceInversion
 * @Author dicoholic
 * @Date 2020/6/9 5:38 下午
 * @Version 1.0
 * <p>
 * 依赖倒转原则 Dependence Inversion Principle
 * <p>
 * 1） 高层模块不应该依赖底层模块，二章都应该依赖其抽象
 * 2） 抽象不应该依赖细节，细节应该依赖抽象
 * 3） 依赖倒转的中心思想是面向接口编程
 * 4） 依赖倒转原则设计理念：相对于细节的多变性，抽象的东西要稳定的多。
 *     以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在Java中
 *     抽象指的是接口或抽象类，细节就是具体的实现类
 * 5） 使用接口或抽象类的目的是指定好规范，而不涉及任何具体的操作，把
 *     细节的任务交给实现类去完成
 *
 *
 * 注意事项和细节
 *
 *    1）低层模块精良都要有抽象类或接口，或者两者都有，程序稳定性更好。
 *    2）变量的声明类型尽量是抽象类或接口，这样我们的变量引用和实际对象
 *      间，就存在一个缓冲层，利于程序拓展和优化
 *    3）继承时遵循里氏替换原则
 */

public class DependenceInversionImprove {

    public static void main(String[] args) {
        PersonImprove personImprove = new PersonImprove();
        personImprove.receive(new EmailImprove());
        personImprove.receive(new WeChatImprove());
    }
}

interface IReceiver {
    String getInfo();
}


class EmailImprove implements IReceiver {
    public String getInfo() {
        return "电子邮件信息： hello，world";
    }
}

class WeChatImprove implements IReceiver {
    public String getInfo() {
        return "微信信息： hello，world";
    }
}

// 完成Person接收消息
// 方法1分析
// 1。 简单，比较容易想到
// 2。 如果我们获取的对象是 微信，短信等等，则新增类，同时Persons也要增加相应的接收方法
// 3。 解决思路：引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口IReceiver发生依赖，
//     因为Email， WeiXin 等等属于接收的番位，他们各自实现IReceiver接口就OK

class PersonImprove {
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}
