package com.dayvar.memento;

import com.dayvar.memento.problem.Editor;

public class Problem {
    public static void main(String args[]){
        Editor editor = new Editor();
        editor.setContent("A");
        editor.setContent("B");
        editor.setContent("C");

        //How Do I handle an undo method???
        //editor.undo();
    }
}
