package com.dayvar.state.example;

public class Driving implements TravelMode {
    @Override
    public Object findETA() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object findDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
