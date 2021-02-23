package org.xumiao.Singleton;

/**
 * 静态嵌套类
 */
public class SingletonCase3 {

    private SingletonCase3() {}

    private static class Holder {
        private static SingletonCase3 instance = new SingletonCase3();
    }

    public static SingletonCase3 getInstance() {
        return Holder.instance;
    }

    public void print() {
        System.out.println("单例模式:静态嵌套类");
    }
}
