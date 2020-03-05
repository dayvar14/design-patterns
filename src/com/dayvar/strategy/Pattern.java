package com.dayvar.strategy;

import com.dayvar.strategy.pattern.ConcreteStrategyA;
import com.dayvar.strategy.pattern.ConcreteStrategyB;
import com.dayvar.strategy.pattern.Context;
import com.dayvar.strategy.pattern.Strategy;

public class Pattern {
    public static void main(String args[]){
        Context context = new Context();

        context.action("Data",new ConcreteStrategyA());
        context.action("Data",new ConcreteStrategyB());
        context.action( "Data", data -> System.out.println("ConcreteStrategyC on "+data));
    }
}
