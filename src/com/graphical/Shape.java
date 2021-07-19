package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;
import com.graphical.intrfaces.PrintNameInterface;

public abstract class Shape implements PrintNameInterface {

    public abstract String getShapeName();

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }

    public String printPerimeter() {
        return "Perimeter " + getShapeName() + " is ";
    }

    public String printArea() {
        return "Area " + getShapeName() + " is ";
    }
}