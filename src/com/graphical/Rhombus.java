package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Rhombus extends Shape implements PrintNameInterface {

    @Override
    public String getShapeName() {
        return "Rhombus";
    }

    public float getPerimeter(float a) {
        return 4 * a;
    }

    public float getArea(float a, float h) {
        return a * h;
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}