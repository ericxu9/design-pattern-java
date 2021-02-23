package org.xumiao.Singleton;

/**
 * 懒汉模式,双重校验
 */
public class SingletonCase2 {

    private SingletonCase2(){}

    private static volatile SingletonCase2 instance = null;

    public static SingletonCase2 getInstance() {
        if (instance == null) {
            //加锁
            synchronized (SingletonCase2.class) {
                //这次判断也是必须的，不然有并发问题（两个线程在上层判断中都为null，那么锁排队的时候就会new两次）
                if (instance == null) {
                    instance = new SingletonCase2();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.println("单例模式:懒汉");
    }
}
