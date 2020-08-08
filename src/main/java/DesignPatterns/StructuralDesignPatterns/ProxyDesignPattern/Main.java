package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class Main {
  public static void main(String[] args) {
    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();
  }
}
