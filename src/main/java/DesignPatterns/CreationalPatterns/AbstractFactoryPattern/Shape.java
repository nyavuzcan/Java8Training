package DesignPatterns.CreationalPatterns.AbstractFactoryPattern;

/**
 * Bu bizim super sinifimiz. Dikkat edin interface olarak tanimlandi. ,
 * Normal sinif veya soyut ta olabilirdi
 */
public interface Shape {
  public double getArea();
  public double getSize();
}