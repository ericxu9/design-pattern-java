package org.xumiao.Decorator;

/**
 * 调料
 */
public abstract class Condiment extends Beverage{

    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }
}
