package org.xumiao.AbstractFactory;

public class Application {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new AmdFactory();
        CPU cpu = computerFactory.makeCPU();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        //组装电脑
        Computer computer = new Computer(cpu, mainBoard);
        System.out.println(computer.toString());
    }
}
