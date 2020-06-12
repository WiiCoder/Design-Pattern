
package com.wiiu.principle.ocp;


import jdk.nashorn.internal.ir.CallNode;

/**
 * @ClassName OcoTheWay1
 * @Author dicoholic
 * @Date 2020/6/12 1:37 下午
 * @Version 1.0
 *
 * 方法1：
 *
 * 优点： 容易理解，简单易操作
 *
 * 缺点： 违反了OCP原则。 在增加新徒刑种类时，需要修改的地方比较多。
 *
 */


public class OcpTheWay1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape t) {
        if (t.m_type == 1) {
            this.DrawCircle();
        } else if(t.m_type == 2) {
            this.DrawRectangle();
        } else {
            this.DrawTriangle();
        }
    }

    public void DrawRectangle() {
        System.out.println("绘制矩形");
    }

    public void DrawCircle() {
        System.out.println("绘制圆形");
    }

    public void DrawTriangle() {
        System.out.println("绘制三角形");
    }
}


class Shape {
    int m_type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape {
    public Triangle() {
        super.m_type = 3;
    }
}