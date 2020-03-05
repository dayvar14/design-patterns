package com.dayvar.state.example;

public class Transit implements TravelMode {
    @Override
    public Object findETA() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object findDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
