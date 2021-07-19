package com.Graphical;

import com.Graphical.Interface.PrintNameInterface;

class Quad extends Shape implements PrintNameInterface {

  @Override
  public String getShapeName() {
    return "Quad";
  }

  public float getPerimeter(float a) {
    return 4 * a;
  }

  public float getArea(float a) {
    return (float) Math.pow(a, 2);
  }

  @Override
  public void printShapeName() {
    System.out.println("Shape name is " + getShapeName());
  }
}