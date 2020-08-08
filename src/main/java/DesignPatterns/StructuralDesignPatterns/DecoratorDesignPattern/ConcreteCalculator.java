package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

/**
 * Decorator isleminin yapilacagi sinif
 */
public class ConcreteCalculator implements Calculator {
  private double value = 0;

  public ConcreteCalculator(double value) {
    this.value = value;
  }

  @Override
  public double calculate() {
    return value;
  }
}