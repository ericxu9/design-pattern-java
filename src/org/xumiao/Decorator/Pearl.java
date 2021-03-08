package org.xumiao.Decorator;

public class Pearl extends Condiment{

    public Pearl(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，加珍珠";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }
}
