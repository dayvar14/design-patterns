package com.dayvar.memento.pattern;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> states = new Stack<>();

    public void push(Memento state){
        states.push(state);
    }

    public Memento pop() {
        return states.pop();
    }
}
