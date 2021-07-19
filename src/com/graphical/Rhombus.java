package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Rhombus extends Shape implements GeometricCalculations {

    private final float a;
    private final float h;

    public Rhombus(float a, float h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Rhombus";
    }

    @Override
    public float getArea() {
        return this.a * this.h;
    }

    @Override
    public float getPerimeter() {
        return 4 * this.a;
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