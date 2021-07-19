package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Rectangle extends Shape implements GeometricCalculations {

    private final float width;
    private final float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public float getArea() {
        return this.width * this.height;
    }

    @Override
    public float getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }

    @Override
    public String printPerimeter() {
        return super.printPerimeter() + getPerimeter();
    }

    @Override
    public String printArea() {
        return super.printArea() + getArea();
    }
}