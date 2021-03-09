package org.xumiao.Observer;

public class Application {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);
        subject.setState(10);
        subject.notifyAllObserver();
    }
}
