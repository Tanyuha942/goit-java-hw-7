package com.graphical;

class Figure extends Shape {

  private Shape figureName;

  Figure(Shape figureName) {
    this.figureName = figureName;
  }


  @Override
  public String getShapeName() {
    return this.figureName.getShapeName();
  }
}