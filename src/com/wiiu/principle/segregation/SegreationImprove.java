package com.wiiu.principle.segregation;

/**
 * @ClassName Segreation1
 * @Author dicoholic
 * @Date 2020/6/9 5:02 下午
 * @Version 1.0
 *
 *  接口隔离原则
 *  即一个类对另一个类的依赖应该建立在最小的接口上
 *  大接口拆分成小接口、避免不必要的依赖
 */

public class SegreationImprove {
    public static void main(String[] args) {
        ImproveA improveA = new ImproveA();
        improveA.depend1(new ImproveD());
        improveA.depend2(new ImproveB());
        improveA.depend3(new ImproveB());

        ImproveC improveC = new ImproveC();
        improveC.depend1(new ImproveB());
        improveC.depend4(new ImproveD());
        improveC.depend5(new ImproveD());
    }
}

interface InterfaceImprove1 {
    void operation1();
}

interface InterfaceImprove2 {

    void operation2();

    void operation3();

}

interface InterfaceImprove3 {

    void operation4();

    void operation5();
}

class ImproveB implements InterfaceImprove1, InterfaceImprove2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
}


class ImproveD implements InterfaceImprove1, InterfaceImprove3 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class ImproveA {
    public void depend1(InterfaceImprove1 i) {
        i.operation1();
    }

    public void depend2(InterfaceImprove2 i) {
        i.operation2();
    }

    public void depend3(InterfaceImprove2 i) {
        i.operation3();
    }
}

class ImproveC {
    public void depend1(InterfaceImprove1 i) {
        i.operation1();
    }

    public void depend4(InterfaceImprove3 i) {
        i.operation4();
    }

    public void depend5(InterfaceImprove3 i) {
        i.operation5();
    }
}