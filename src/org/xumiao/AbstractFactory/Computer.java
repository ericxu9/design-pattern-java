package org.xumiao.AbstractFactory;

public class Computer {

    private CPU cpu;
    private MainBoard mainBoard;

    public Computer() {
    }

    public Computer(CPU cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public String toString() {
        return "CPU:" + cpu + "     MainBoard:" + mainBoard;
    }
}
