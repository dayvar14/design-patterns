package com.dayvar.state.abuse;

public class StopWatch {
    private boolean isRunning;

    public void click(){
        if (isRunning){
            isRunning = false;
            System.out.println("Stopped");
        } else {
            isRunning = true;
            System.out.println("Started");
        }
    }
}
