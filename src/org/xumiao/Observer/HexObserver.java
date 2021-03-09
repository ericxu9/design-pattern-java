package org.xumiao.Observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String hexStr = Integer.toHexString(this.subject.getState());
        System.out.println(String.format("订阅的数据发生变化，新的数据处理为十六进制值为：%s", hexStr));
    }
}
