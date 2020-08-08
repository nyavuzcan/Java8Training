package DesignPatterns.BehavioralDesignPatterns.IteratorDesignPattern;

public class NotebookStore {
  private Notebook[] notebookList = null;
  public NotebookStore() {
    notebookList = new Notebook[5];
    notebookList[0] = new Notebook("Notebook1");
    notebookList[1] = new Notebook("Notebook2");
    notebookList[2] = new Notebook("Notebook3");
    notebookList[3] = new Notebook("Notebook4");
    notebookList[4] = new Notebook("Notebook5");
  }

  public Iterator iterator() {
    return new NotebookIterator(notebookList);
  }

}