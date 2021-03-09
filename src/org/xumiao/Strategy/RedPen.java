package org.xumiao.Strategy;

public class RedPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println(String.format("用红色笔画图：radius：%d, x:%d, y:%d", radius, x, y));
    }
}
