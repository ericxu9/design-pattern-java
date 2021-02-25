package org.xumiao.Proxy;

public class FoodServiceProxy implements FoodService{

    private FoodService foodService = new FoodServiceImpl();

    @Override
    public void makeChicken() {
        System.out.println("准备制作鸡肉啦~");
        foodService.makeChicken();
        System.out.println("制作完成！");
    }
}
