package org.xumiao.Bridge;

public class GreenPen implements DrawApi {
    @Override
    public void draw(float radius, int x, int y) {
        System.out.println(String.format("使用绿色笔画图，radius：%f，x：%d，y：%d", radius, x, y));
    }
}
