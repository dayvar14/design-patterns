package com.dayvar.iterator;

import com.dayvar.iterator.pattern.BrowserHistoryArray;
import com.dayvar.iterator.pattern.BrowserHistoryList;
import com.dayvar.iterator.pattern.Iterator;

public class Pattern {
    public static void main(String[] args){
        //Original Class uses a list to store data
        BrowserHistoryList history = new BrowserHistoryList();
        history.push("google.com");
        history.push("codewithmosh.com");
        history.push("facebook.com");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()){
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        //Changing the internal data structure of class to use an array only required changes within the class
        //does not affect any logic that used the class iterator before the changes

        BrowserHistoryArray history2 = new BrowserHistoryArray();
        history.push("google.com");
        history.push("codewithmosh.com");
        history.push("facebook.com");

        Iterator<String> iterator2 = history.createIterator();
        while (iterator.hasNext()){
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}
