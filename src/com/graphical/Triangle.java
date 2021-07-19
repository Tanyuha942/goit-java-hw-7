package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Triangle extends Shape implements PrintNameInterface {

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    public float getPerimeter(float base, float sideLeft, float sideRight) {
        return base + sideLeft + sideRight;
    }

    public float getArea(float base, float height) {
        return 0.5F * base * height;
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}