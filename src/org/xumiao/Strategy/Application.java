package org.xumiao.Strategy;

public class Application {

    public static void main(String[] args) {
        Context context = new Context(new BluePen());
        context.execDraw(10, 0, 0);
    }
}
