package com.dayvar.template;

import com.dayvar.template.example.CustomWindowA;
import com.dayvar.template.example.CustomWindowB;

public class Example {
    public static void main(String args[]){
        CustomWindowA customWindowA = new CustomWindowA();
        customWindowA.close();

        CustomWindowB customWindowB = new CustomWindowB();
        customWindowB.close();
    }
}
