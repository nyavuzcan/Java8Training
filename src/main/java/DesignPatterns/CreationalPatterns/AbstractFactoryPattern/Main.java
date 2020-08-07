package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Test sinifi.
 */
public class Main {
  public static void main(String[] args) {
    Shape rectangle = ShapeFactory.getShape(new RectangleFactory());
    ((Rectangle) rectangle).setWidth(13);
    ((Rectangle) rectangle).setHeight(5);

    Shape circle = ShapeFactory.getShape(new CircleFactory());
    ((Circle) circle).setRadius(4);

    System.out.println("Rectangle area: "+rectangle.getArea()+" and size: "+rectangle.getSize());
    System.out.println("Circle area: "+circle.getArea()+" and size: "+circle.getSize());
  }
}