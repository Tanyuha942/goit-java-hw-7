package com.graphical;

import com.graphical.intrfaces.GeometricCalculations;

class Quad extends Shape implements GeometricCalculations {

  private float a;

  public Quad(float a) {
    this.a = a;
  }

  @Override
  public String getShapeName() {
    return "Quad";
  }

  @Override
  public float getArea() {
    return (float) Math.pow(a, 2);
  }

  @Override
  public float getPerimeter() {
    return 4 * a;
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