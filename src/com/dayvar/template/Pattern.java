package com.dayvar.template;

import com.dayvar.template.pattern.TaskA;
import com.dayvar.template.pattern.TaskB;

public class Pattern {
    public static void main(String[] args){
        TaskA taskA = new TaskA();
        taskA.execute();

        TaskB taskB = new TaskB();
        taskB.execute();
    }
}
