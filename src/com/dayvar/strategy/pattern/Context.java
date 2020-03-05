package com.dayvar.strategy.pattern;

public class Context {

    public void action(String data, Strategy strategy){
        //Running all strategies
        strategy.strategy(data);

        //Doing Action
        System.out.println("Action on " + data);
    }
}
