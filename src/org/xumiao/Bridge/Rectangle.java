package org.xumiao.Bridge;

public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(DrawApi drawApi, int x, int y) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.draw(0, x, y);
        System.out.println("Rectangle::draw().");
    }
}
