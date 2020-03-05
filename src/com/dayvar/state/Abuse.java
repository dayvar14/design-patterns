package com.dayvar.state;

import com.dayvar.state.abuse.StopWatch;

public class Abuse {
    public static void main(String args[]){
        //Example of a bad place to use states
        StopWatch stopWatch = new StopWatch();

        //Stopwatch only has two states on and off
        stopWatch.click();
        stopWatch.click();

        //For simple cases like this, use of states is unnecessary
    }
}
