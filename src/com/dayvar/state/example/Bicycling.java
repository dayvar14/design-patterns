package com.dayvar.state.example;

public class Bicycling implements TravelMode {
    @Override
    public Object findETA() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object findDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
