package org.xumiao.AbstractFactory;

public class AmdCPU implements CPU{
    @Override
    public void run() {
        System.out.println("AmdCPU::run().");
    }
}
