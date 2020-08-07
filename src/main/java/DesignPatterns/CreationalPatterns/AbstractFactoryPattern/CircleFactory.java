package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

public class CircleFactory implements ShapeAbstractFactory {
  @Override
  public Shape createShape() {
    return new Circle();
  }
}