package DesignPatterns.BehavioralDesignPatterns.IteratorDesignPattern;

public class IteratorMain {

  public static void main(String[] args) {

  NotebookStore store = new NotebookStore();
  Iterator iterator = store.iterator();

  while (iterator.hasNext()) {
    System.out.println(iterator.nextElement().getName());
  }

}

}