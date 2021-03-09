package org.xumiao.Observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this); //订阅
    }

    @Override
    public void update() {
        String binaryStr = Integer.toBinaryString(this.subject.getState());
        System.out.println(String.format("订阅的数据发生变化，新的数据处理为二进制值为：%s",binaryStr));
    }
}
