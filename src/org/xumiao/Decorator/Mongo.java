package org.xumiao.Decorator;

/**
 * 芒果配料
 */
public class Mongo extends Condiment {

    public Mongo(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "，加芒果";
    }

    @Override
    public double cost() {
        return beverage.cost() + 4;
    }
}
