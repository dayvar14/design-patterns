package com.dayvar.iterator.pattern;

public interface Iterator<T>{
    boolean hasNext();
    T current();
    void next();
}
