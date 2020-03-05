package com.dayvar.state;

import com.dayvar.state.pattern.*;

public class Pattern {
    public static void main(String[] args){
        Context context = new Context();

        //Set ConcreteStateA for handle()
        context.setCurrentState(new ConcreteStateA());
        context.handle();

        //Set ConcreteStateB for handle()
        context.setCurrentState(new ConcreteStateB());
        context.handle();
    }


}
