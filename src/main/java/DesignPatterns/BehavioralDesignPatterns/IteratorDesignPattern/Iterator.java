package DesignPatterns.BehavioralDesignPatterns.IteratorDesignPattern;


import java.lang.reflect.Type;

public interface Iterator {
  public boolean hasNext();
  public Notebook nextElement();

}