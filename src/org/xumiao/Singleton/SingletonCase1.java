package org.xumiao.Singleton;

/**
 * 饿汉模式
 */
public class SingletonCase1 {

    private SingletonCase1() {}

    private static SingletonCase1 instance = new SingletonCase1();

    public static SingletonCase1 getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("单例模式:饿汉");
    }
}
