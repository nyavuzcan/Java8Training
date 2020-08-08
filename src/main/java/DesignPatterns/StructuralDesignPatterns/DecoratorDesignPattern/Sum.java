package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

/**
 * Toplama isleminin yapildigi sinif
 */
public class Sum extends CalculateDecorator {
  private double value;
  protected Sum(Calculator calculator,double value) {
    super(calculator); //cagirmak zorunlu
    this.value=value;
  }

  @Override
  public double calculate() {
    return calculator.calculate()+value; //calculator nesnesi CalculateDecorator sinifindan geliyor
  }
}