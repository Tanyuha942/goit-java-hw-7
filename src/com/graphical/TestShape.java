package com.graphical;

public class TestShape {

  public static void main(String[] args) {
    Shape circle = new Circle(4.5F);
    Shape quad = new Quad(12F);
    Shape rectangle = new Rectangle(5F, 9.5F);
    Shape rhombus = new Rhombus(21.41F, 7.36F);
    Shape trapeze = new Trapeze(37.29F, 18.25F, 18.25F, 21.92F, 17.32F);
    Shape triangle = new Triangle(18.25F, 21.92F, 21.92F, 17.32F);

    System.out.println(circle.getShapeName());
    System.out.println(quad.getShapeName());
    System.out.println(rectangle.getShapeName());
    System.out.println(rhombus.getShapeName());
    System.out.println(trapeze.getShapeName());
    System.out.println(triangle.getShapeName());
//*****************************************//
    System.out.println("//************************************//");
    System.out.println(circle.printPerimeter());
    System.out.println(circle.printArea());
    System.out.println("//************************************//");
    System.out.println(quad.printPerimeter());
    System.out.println(quad.printArea());
    System.out.println("//************************************//");
    System.out.println(rectangle.printPerimeter());
    System.out.println(rectangle.printArea());
    System.out.println("//************************************//");
    System.out.println(rhombus.printPerimeter());
    System.out.println(rhombus.printArea());
    System.out.println("//************************************//");
    System.out.println(trapeze.printPerimeter());
    System.out.println(trapeze.printArea());
    System.out.println("//************************************//");
    System.out.println(triangle.printPerimeter());
    System.out.println(triangle.printArea());
//*****************************************//
  }
}