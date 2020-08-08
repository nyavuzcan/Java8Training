package DesignPatterns.BehavioralDesignPatterns.ObserverDesignPattern;

/**
 * SERVER
 */
public interface Observable {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObserver();
}