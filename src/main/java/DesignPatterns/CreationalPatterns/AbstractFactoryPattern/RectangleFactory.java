package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Rectangle sinifi icin fabrika sinifi
 */
public class RectangleFactory implements ShapeAbstractFactory {
  @Override
  public Shape createShape() {
    return new Rectangle();
  }
}