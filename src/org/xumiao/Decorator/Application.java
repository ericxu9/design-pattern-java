package org.xumiao.Decorator;

/**
 * 装饰者模式
 */
public class Application {

    public static void main(String[] args) {
        //绿茶+芒果+柠檬
        Beverage beverage = new GreenTea();
        beverage = new Lemon(beverage);
        beverage = new Mongo(beverage);

        System.out.println(beverage.getDescription() + " ￥价格：" + beverage.cost());

        //来一份芒果+珍珠+红茶
        Beverage beverage2 = new Mongo(new Pearl(new BlackTea()));
        System.out.println(beverage2.getDescription() + " ￥价格：" + beverage2.cost());
    }
}
