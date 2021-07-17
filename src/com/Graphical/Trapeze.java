package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Trapeze extends Shape implements PrintNameInterface {

    @Override
    public String getShapeName() {
        return "Trapeze";
    }

    public float getPerimeter(float a, float b, float c, float d) {
        return a + b + c + d;
    }

    public float getArea(float a, float b, float h) {
        return 0.5F * (a + b) * h;
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}