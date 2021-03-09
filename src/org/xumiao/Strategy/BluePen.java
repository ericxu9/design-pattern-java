package org.xumiao.Strategy;

public class BluePen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println(String.format("用蓝色笔画图：radius：%d, x:%d, y:%d", radius, x, y));
    }
}
