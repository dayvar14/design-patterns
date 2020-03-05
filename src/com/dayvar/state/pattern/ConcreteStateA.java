package com.dayvar.state.pattern;

public class ConcreteStateA implements State {

    @Override
    public void handle() {
        System.out.println("Handling with ConcreteStateA");
    }
}
