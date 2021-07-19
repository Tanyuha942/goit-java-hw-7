package com.Graphical;

public class TestShape {

  public static void main(String[] args) {
    new Circle().printShapeName();
    new Quad().printShapeName();
    new Rhombus().printShapeName();
    new Triangle().printShapeName();
    new Trapeze().printShapeName();
    new Rectangle().printShapeName();
//*****************************************//
    System.out.println("//************************************//");
    Circle circle = new Circle();
    Quad quad = new Quad();
    Rhombus rhombus = new Rhombus();
    Triangle triangle = new Triangle();
    Trapeze trapeze = new Trapeze();
    Rectangle rectangle = new Rectangle();

//*****************************************//
    System.out.println("Perimeter " + circle.getShapeName() + " is " + circle.getPerimeter(46.6F));
    System.out.println("Perimeter " + quad.getShapeName() + " is " + quad.getPerimeter(4.12F));
    System.out.println("Perimeter " + rhombus.getShapeName() + " is " + rhombus.getPerimeter(3.56F));
    System.out.println("Perimeter " + triangle.getShapeName() + " is " + triangle.getPerimeter(46.6F, 23.31F, 23.31F));
    System.out.println("Perimeter " + trapeze.getShapeName() + " is " + trapeze.getPerimeter(37.29F, 18.25F, 18.25F, 21.92F));
    System.out.println("Perimeter " + rectangle.getShapeName() + " is " + rectangle.getPerimeter(52.32F, 83.21F));
//*****************************************//
    System.out.println("//************************************//");
    System.out.println("Area " + circle.getShapeName() + " is " + circle.getArea(46.6F));
    System.out.println("Area " + quad.getShapeName() + " is " + quad.getArea(4.12F));
    System.out.println("Area " + rhombus.getShapeName() + " is " + rhombus.getArea(3.56F, 1.82F));
    System.out.println("Area " + triangle.getShapeName() + " is " + triangle.getArea(46.6F, 16.21F));
    System.out.println("Area " + trapeze.getShapeName() + " is " + trapeze.getArea(37.29F, 29.65F, 18.25F));
    System.out.println("Area " + rectangle.getShapeName() + " is " + rectangle.getArea(52.32F, 83.21F));
  }
}