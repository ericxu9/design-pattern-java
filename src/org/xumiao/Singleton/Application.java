package org.xumiao.Singleton;

public class Application {

    public static void main(String[] args) {
        SingletonCase1.getInstance().print();
        System.out.println(SingletonCase1.getInstance() == SingletonCase1.getInstance());

        SingletonCase2.getInstance().print();
        System.out.println(SingletonCase2.getInstance() == SingletonCase2.getInstance());

        SingletonCase3.getInstance().print();
        System.out.println(SingletonCase3.getInstance() == SingletonCase3.getInstance());

        SingletonCase4.getInstance().print();
        System.out.println(SingletonCase4.getInstance() == SingletonCase4.getInstance());
    }
}
