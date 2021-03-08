package org.xumiao.Bridge;

public class Application {

    public static void main(String[] args) {
        Shape circle = new Circle(new BluePen(),5.0f);
        circle.draw();

        Shape rectangle = new Rectangle(new RedPen(), 10, 20);
        rectangle.draw();
    }
}
