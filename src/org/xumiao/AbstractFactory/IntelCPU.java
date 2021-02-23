package org.xumiao.AbstractFactory;

public class IntelCPU implements CPU{
    @Override
    public void run() {
        System.out.println("IntelCPU::run().");
    }
}
