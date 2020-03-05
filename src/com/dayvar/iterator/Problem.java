package com.dayvar.iterator;

import com.dayvar.iterator.problem.BrowserHistory;

public class Problem {
    public static void main(String args[]){
        BrowserHistory history = new BrowserHistory();
        history.push("google.com");
        history.push("codewithmosh.com");
        history.push("facebook.com");

        //If the BrowserHistory Class changes the Data Structure
        //It can break the logic we use to iterate through the array
        for( var i = 0; i < history.getUrls().size(); i++){
            String url = history.getUrls().get(i);
            System.out.println(url);
        }
    }

}
