package org.xumiao.AbstractFactory;

public class AmdFactory implements ComputerFactory{
    @Override
    public CPU makeCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }
}
