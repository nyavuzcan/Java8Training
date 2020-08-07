package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Somut fabrika siniflarinin turune gore Shape nesneleri
 * uretilmesini saglar
 */
public class ShapeFactory {
  public static Shape getShape(ShapeAbstractFactory factory){ //SuperClass'ı parametre alıyor
    return factory.createShape();
  }
}