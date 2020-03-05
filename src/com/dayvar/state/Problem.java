package com.dayvar.state;

import com.dayvar.state.problem.Canvas;
import com.dayvar.state.problem.ToolType;

public class Problem {
    public static void main(String[] args){
        Canvas canvas = new Canvas();
        //Using if/switch statements and ENUMS to run different actions
        canvas.setCurrentTool(ToolType.BRUSH);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.ERASER);
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(ToolType.SELECTION);
        canvas.mouseDown();
        canvas.mouseUp();

        //Lacks extensibility
    }
}
