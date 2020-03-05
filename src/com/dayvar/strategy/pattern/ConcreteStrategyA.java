package com.dayvar.strategy.pattern;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void strategy(String data) {
        System.out.println("ConcreteStrategyA on "+data);
    }
}
