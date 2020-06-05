package HackerRankJava.Inheritance;

class Bird extends Animal
{
  void fly()
  {
    System.out.println("I am flying");
  }

  @Override
  void sing() {
    System.out.println("I am singing");
  }

  @Override
  void walk() {
    System.out.println("I am walking");
  }
}

class Animal {
  void sing()
  {
    System.out.println("I am singing");
  }
  void walk()
  {
    System.out.println("I am walking");
  }
}

public class Solution{

  public static void main(String args[]){

    Bird bird = new Bird();
    bird.walk();
    bird.fly();
    bird.sing();

  }
}