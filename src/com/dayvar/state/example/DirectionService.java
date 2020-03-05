package com.dayvar.state.example;

public class DirectionService {
    private TravelMode travelMode;

    public Object getEta() {
        return travelMode.findETA();
    }

    public Object getDirection() {
        return travelMode.findDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
