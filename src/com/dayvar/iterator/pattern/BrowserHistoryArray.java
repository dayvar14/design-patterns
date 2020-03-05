package com.dayvar.iterator.pattern;

import java.util.Stack;

public class BrowserHistoryArray {

    private String[] urls = new String[10];
    private int currentIndex = 0;

    public void push(String url){
        urls[currentIndex++] = url;
    }

    public String pop(){
        return urls[--currentIndex];
    }

    public Iterator<String> createIterator(){
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowserHistoryArray history;
        private int index;

        public ArrayIterator(BrowserHistoryArray history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index < history.urls.length);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
