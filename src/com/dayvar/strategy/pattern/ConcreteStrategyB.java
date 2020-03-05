package com.dayvar.strategy.pattern;

public class ConcreteStrategyB implements Strategy{
    @Override
    public void strategy(String data) {
        System.out.println("ConcreteStrategyB on "+data);
    }
}
