package DesignPatterns.CreationalPatterns.BuilderDesignPattern;

public class Main {
  public static void main(String[] args) {

    Company company = new Company.Builder("Google")
        .setAddress("San Francisco").
            build();
  }
}
