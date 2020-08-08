package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

/**
 * Test sinifi
 */
public class Test {
  public static void main(String[] args) {
    //somut component sinifi her zaman en ice yazilir. Somut decorator siniflari
    //bu somut component sinifi sarmakla gorevlidir. Ayni zamanda kendilerini de sarabilirler
    //yani new Multiply(new Multiply()) seklinde de olabilir...
    Calculator calculator=new Multiply(new Sum(new Multiply(new ConcreteCalculator(12),4),4),4);
    double result=calculator.calculate();
    System.out.println(result);
  }
}