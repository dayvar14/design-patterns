package com.dayvar.state.pattern;

public class ConcreteStateB implements State {

    @Override
    public void handle() {
        System.out.println("Handling with ConcreteStateB");
    }
}
