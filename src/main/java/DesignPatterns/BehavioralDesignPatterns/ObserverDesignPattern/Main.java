package DesignPatterns.BehavioralDesignPatterns.ObserverDesignPattern;

public class Main {

  public static void main(String[] args) {

    UserMan userMan = new UserMan();
    UserWoman userWoman = new UserWoman();

    NoticeObservable noticeObservable = new NoticeObservable();

    userWoman.setObservable(noticeObservable);

    noticeObservable.addObserver(userMan);
    noticeObservable.addObserver(userWoman);
    noticeObservable.notifyObserver();

    userWoman.removeObserver();
    noticeObservable.notifyObserver();

  }
}