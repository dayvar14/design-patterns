package com.dayvar.iterator.problem;

import java.util.List;
import java.util.Stack;

public class BrowserHistory {

    private Stack<String> urls = new Stack<>();

    public void push(String url){
        urls.push(url);
    }

    public String pop(){
        return urls.pop();
    }

    public List<String> getUrls() {
        return urls.subList(0,urls.size());
    }
}
