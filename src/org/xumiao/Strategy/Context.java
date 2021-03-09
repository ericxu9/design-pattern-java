package org.xumiao.Strategy;

/**
 * 定义上下文来使用策略
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execDraw(int radius, int x, int y) {
        strategy.draw(radius, x, y);
    }
}
