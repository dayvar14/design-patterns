package com.dayvar.memento;

import com.dayvar.memento.pattern.Originator;
import com.dayvar.memento.pattern.Caretaker;

public class Pattern {
    public static void main(String[] args){
        var editor = new Originator();
        var history = new Caretaker();

        editor.setContent("a");

        history.push(editor.createState());
        editor.setContent("b");

        history.push(editor.createState());
        editor.setContent("c");

        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
