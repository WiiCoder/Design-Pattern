package com.wiiu.principle.dependenceInversion;

/**
 * @ClassName DependencyPass
 * @Description TODO
 * @Author dicoholic
 * @Date 2020/6/11 2:06 下午
 * @Version 1.0
 */

public class DependencyPass {

    public static void main(String[] args) {
        // 方法1 调用
        // CWeeTV cWeeTV = new CWeeTV();
        // OpenAndClose openAndClose = new OpenAndClose();
        // openAndClose.open(cWeeTV);

        // 方法2 调用
        // CWeeTV cWeeTV = new CWeeTV();
        // OpenAndClose openAndClose = new OpenAndClose(cWeeTV);
        // openAndClose.open();

        // 方法3 调用
        CWeeTV cWeeTV = new CWeeTV();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(cWeeTV);
        openAndClose.open();
    }

}

class CWeeTV implements ITV {
    @Override
    public void play() {
        System.out.println("创维电视已打开...");
    }
}

// 方式1
// 通过接口传递实现依赖
//interface IOpenAndClose {
//    void open(ITV tv);
//}
//
//interface  ITV {
//    void play();
//}
//
//class OpenAndClose implements  IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

// 方式2
// 通过构造方法实现依赖
//interface IOpenAndClose {
//    void open();
//}
//
//interface  ITV {
//    void play();
//}
//
//class OpenAndClose implements  IOpenAndClose {
//
//    public ITV tv;
//
//    public OpenAndClose(ITV tv) {
//        this.tv = tv;
//    }
//
//    @Override
//    public void open() {
//        tv.play();
//    }
//}


// 方式3
// 通过setter方法实现依赖
interface IOpenAndClose {
    void open();
    void setTv(ITV tv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}