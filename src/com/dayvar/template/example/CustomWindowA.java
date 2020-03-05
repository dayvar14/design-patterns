package com.dayvar.template.example;

public class CustomWindowA extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Running CustomWindowA code before window closes...");
    }

    @Override
    protected void afterClose() {
        System.out.println("Running CustomWindowA code after window closes...");
    }
}
