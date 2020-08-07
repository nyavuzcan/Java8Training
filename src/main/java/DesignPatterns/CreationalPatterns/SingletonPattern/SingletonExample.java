package DesignPatterns.CreationalPatterns.SingletonPattern;

public class SingletonExample {
  /**
   * Kodda kkullanılan lazy.
   * Eager için
   *
   * private static SingletonExample instance = new SingletonExample();
   *
   * veya
   *
   *   private static SingletonExampleEagerInitialization2 instance;
   *
   *     static {
   *         instance = new SingletonExampleEagerInitialization2();
   *     }
   *
   *     şeklinde kullanılabilir
   */
  private static SingletonExample instance;

  private SingletonExample(){}

  public static SingletonExample getInstance(){

    if (instance == null){
      instance = new SingletonExample();
    }

    return instance;
  }
}