package org.xumiao.Strategy;

public class GreenPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println(String.format("用绿色笔画图：radius：%d, x:%d, y:%d", radius, x, y));
    }
}
