package com.dayvar.iterator.pattern;

import java.util.Stack;

public class BrowserHistoryList {

    private Stack<String> urls = new Stack<>();

    public void push(String url){
        urls.push(url);
    }

    public String pop(){
        return urls.pop();
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private BrowserHistoryList history;
        private int index;

        public ListIterator(BrowserHistoryList history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
