package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Triangle extends Shape implements GeometricCalculations {

    private float base, sideLeft, sideRight, height;

    public Triangle(float base, float sideLeft, float sideRight, float height) {
        this.base = base;
        this.sideLeft = sideLeft;
        this.sideRight = sideRight;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public float getArea() {
        return 0.5F * this.base * this.height;
    }

    @Override
    public float getPerimeter() {
        return this.base + this.sideLeft + this.sideRight;
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