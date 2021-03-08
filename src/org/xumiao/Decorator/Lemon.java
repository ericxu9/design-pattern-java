package org.xumiao.Decorator;

/**
 * 柠檬配料
 */
public class Lemon extends Condiment{

    public Lemon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，加柠檬";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2; //加柠檬需要付2块钱哟~
    }
}
