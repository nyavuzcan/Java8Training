package DesignPatterns.BehavioralDesignPatterns.MediatorDesignPattern;

public class Button {
  private Mediator mediator;

  // constructor, getters and setters

  public void press() {
    mediator.press();
  }
}