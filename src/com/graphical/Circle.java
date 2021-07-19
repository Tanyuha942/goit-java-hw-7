package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Circle extends Shape implements GeometricCalculations {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * this.radius);
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