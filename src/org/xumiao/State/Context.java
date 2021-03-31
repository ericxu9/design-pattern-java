package org.xumiao.State;

public class Context {

    private State state;
    private String name;

    public Context(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
