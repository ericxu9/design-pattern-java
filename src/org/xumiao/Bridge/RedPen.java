package org.xumiao.Bridge;

public class RedPen  implements DrawApi{
    @Override
    public void draw(float radius, int x, int y) {
        System.out.println(String.format("使用红色笔画图，radius：%f，x：%d，y：%d"));
    }
}
