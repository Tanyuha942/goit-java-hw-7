package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Trapeze extends Shape implements GeometricCalculations {

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float h;

    public Trapeze(float a, float b, float c, float d, float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Trapeze";
    }

    @Override
    public float getArea() {
        return 0.5F * (this.a + this.b) * this.h;
    }

    @Override
    public float getPerimeter() {
        return this.a + this.b + this.c + this.d;
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