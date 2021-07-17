package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

public abstract class Shape implements PrintNameInterface {

    public String getShapeName() {
        return "Shape";
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}