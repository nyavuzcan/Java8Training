package DesignPatterns.CreationalPatterns.FactoryMethodPattern;

/**
 * Aynı abstract sınıf veya interface'den türeyen nesneleri üretmek için
 * Amaç nesne oluşturmayı client tarafından alıp şişmmesini engelleyerek
 * ortak bir factory class'ı üzerinden prodct nesnesini döndürmeyi sağlamak.
 *
 * Client -> Factory -> Product
 *
 * Elimizde birden çok class varsa ve bu classlar bir interface üzerinden
 * implement ediyorsa kullanılmalıdır.
 *
 * !- Paylaşımlı bir base class'ı yoksa kullanılmamalıdır.
 *
 */
public class Main {

  public static void main(String[] args) {

    try {
      Asus asus = (Asus) ComputerFactory.createComputer(Asus.class);
      asus.since(1234);
      asus.name();

      Mac mac = (Mac) ComputerFactory.createComputer(Mac.class);
      mac.name();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}