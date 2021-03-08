package org.xumiao.Bridge;

public class Circle extends Shape {

    private float radius;

    public Circle(DrawApi drawApi, float radius) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.draw(radius, 0, 0);
        System.out.println("Circle::draw().");
    }
}
