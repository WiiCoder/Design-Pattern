
package com.wiiu.principle.ocp.improve;


/**
 * @ClassName OcoTheWay1
 * @Author dicoholic
 * @Date 2020/6/12 1:37 下午
 * @Version 1.0
 *
 * 方法2：
 *
 * 满足 ocp 原则
 *
 */


public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Other());
    }
}

class GraphicEditor {
    public void drawShape(Shape t) {
        t.draw();
    }
}


abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制 Rectangle");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制 Circle");
    }
}

class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制 Tiriangle");
    }
}

class Other extends Shape {

    Other() {
        super.m_type =4;
    }

    @Override
    public void draw() {
        System.out.println("绘制 其他图像");
    }
}