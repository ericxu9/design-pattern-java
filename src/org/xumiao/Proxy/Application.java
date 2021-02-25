package org.xumiao.Proxy;

public class Application {

    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }
}
