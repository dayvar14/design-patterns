package com.dayvar.template.example;

public class CustomWindowB extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Running CustomWindowB code before window closes...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Running CustomWindowB code after window closes...");
    }
}
