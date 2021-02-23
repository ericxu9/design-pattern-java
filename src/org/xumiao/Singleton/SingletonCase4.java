package org.xumiao.Singleton;

public class SingletonCase4 {

    private SingletonCase4() {}

    public static SingletonCase4 getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    public void print() {
        System.out.println("单例模式:枚举类");
    }

    static enum SingletonEnum {
        INSTANCE;

        private SingletonCase4 instance;

        private SingletonEnum() {
            instance = new SingletonCase4();
        }

        public SingletonCase4 getInstance() {
            return instance;
        }

    }
}
