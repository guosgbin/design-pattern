package cn.guosgbin.principle.OCP.before;

/**
 * @author: Dylan Kwok
 * @date: 2020/3/24 21:23
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
        if (shape.type == 1) {
            drawRectangle();
        } else if (shape.type == 2) {
            drawCircle();
        }
    }

    private void drawRectangle() {
        System.out.println("正在画矩形...");
    }

    private void drawCircle() {
        System.out.println("正在画圆形...");
    }
}

// 形状类
class Shape {
    int type;
}
// 矩形
class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
}
// 圆形
class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
}