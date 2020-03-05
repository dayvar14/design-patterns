package com.dayvar.memento.example;

import java.util.Stack;

public class History<T> {
    private Stack<T> states = new Stack<>();

    public void push(T state){
        states.push(state);
    }

    public T pop() {
        return states.pop();
    }
}