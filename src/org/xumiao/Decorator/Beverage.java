package org.xumiao.Decorator;

/**
 * 饮料基类
 */
public abstract class Beverage {

    /**
     * 返回描述
     * @return
     */
    public abstract String getDescription();

    /**
     * 返回价格
     * @return
     */
    public abstract double cost();
}
