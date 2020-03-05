package com.dayvar.state;

import com.dayvar.state.example.*;

public class Example {
    public static void main(String[] args){
        DirectionService ds = new DirectionService();

        //Walking Service
        ds.setTravelMode(new Bicycling());
        printDirectionService(ds);

        ds.setTravelMode(new Walking());
        printDirectionService(ds);

        ds.setTravelMode(new Transit());
        printDirectionService(ds);

        ds.setTravelMode(new Driving());
        printDirectionService(ds);
    }

    public static void printDirectionService(DirectionService ds){
        ds.getEta();
        ds.getDirection();
    }
}
