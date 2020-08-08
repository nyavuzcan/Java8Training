package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

/**
 * Carpma isleminin yapildigi sinif
 */
public class Multiply extends CalculateDecorator {
  private double value; //carpim katsayisi
  protected Multiply(Calculator calculator,double value) {
    super(calculator);
    this.value=value;
  }

  @Override
  public double calculate() {
    return calculator.calculate()*value; //calculator nesnesi, CalculateDecorator sinifindan geliyor
  }
}