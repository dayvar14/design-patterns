package com.dayvar.memento;

import com.dayvar.memento.example.Document;
import com.dayvar.memento.example.DocumentState;
import com.dayvar.memento.example.History;

public class Example {
    private static int step = 1;

    public static void main(String args[]){
        Document document = new Document();

        History<DocumentState> history = new History<>();

        System.out.println("Starting state...");
        history.push(document.createState());
        printCurrentStep(document);

        System.out.println("Starting state creation...");

        document.setContent("Hello World");
        history.push(document.createState());
        printCurrentStep(document);

        document.setFontName("Comic Sans");
        history.push(document.createState());
        printCurrentStep(document);

        document.setFontSize(20);
        printCurrentStep(document);

        System.out.println("Starting state restores...");
        document.restore(history.pop());
        printCurrentStep(document);

        document.restore(history.pop());
        printCurrentStep(document);

        document.restore(history.pop());
        printCurrentStep(document);
    }


    private static void printCurrentStep(Document d){
        System.out.println(step++ +" : "+d.toString());
    }
}
