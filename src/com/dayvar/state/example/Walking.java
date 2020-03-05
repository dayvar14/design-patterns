package com.dayvar.state.example;

public class Walking implements TravelMode {
    @Override
    public Object findETA() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object findDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
