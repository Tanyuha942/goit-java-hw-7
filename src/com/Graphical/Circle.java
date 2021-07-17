package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Circle extends Shape implements PrintNameInterface {

    @Override
    public String getShapeName() {
        return "Circle";
    }

    public float getPerimeter(float radius) {
        return (float) (2 * Math.PI * radius);
    }

    public float getArea(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}