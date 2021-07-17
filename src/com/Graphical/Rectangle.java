package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Rectangle extends Shape implements PrintNameInterface {

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    public float getPerimeter(float width, float height) {
        return width * 2 + height * 2;
    }

    public float getArea(float width, float height) {
        return width * height;
    }

    @Override
    public void printShapeName() {
        System.out.println("Shape name is " + getShapeName());
    }
}