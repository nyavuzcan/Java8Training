package DesignPatterns.CreationalPatterns.SingletonPattern;

/**
 * Singleton Pattern bize global bir erişim noktası sunar , global değişkenler gibi dezavantajı yoktur.
 * Bu dezavantajlardan biri şudur : objemizi global değişken olarak yarattığımızda uygulama başladığında nesne yaratılacak,
 * nesne kaynak yoğunsa ve uygulamanız onu kullanmadan tamamlandıysa ne olacak?
 * Singleton Pattern’de bir object ancak ona ihtiyaç duyduğumuzda yaratılır.
 */
public class Main {
  public static void main(String[] args) {

    SingletonExample singletonExample1 = SingletonExample.getInstance();
    SingletonExample singletonExample2 = SingletonExample.getInstance();

    System.out.println("singletonExample1 ==> " + singletonExample1);
    System.out.println("singletonExample2 ==> " + singletonExample2);

    System.out.println(singletonExample1 == singletonExample2);
  }
}
