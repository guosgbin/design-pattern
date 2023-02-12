package cn.guosgbin.principle.OCP.after;

/**
 * @author: Dylan KWok
 * @date: 2020/3/24 21:23
 * 古之立大事者，不惟有超世之才，亦必有坚忍不拔之志。
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

// 形状类
abstract class Shape {
    int type;

    public abstract void draw();
}

// 矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("正在画矩形...");
    }
}

// 圆形
class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("正在画圆形...");
    }
}