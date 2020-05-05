package EbookJava8.JAVA8OPTIONAL;

/**
 * Bir Optional nesnesi, Optional sınıfının çeşitli statik metodlarıyla
 * oluşturulmaktadır. Bunlar empty, of ve ofNullable 'dir.
 */

import java.util.Optional;

/**
 * empty
 * Taze bir Optional nesnesi oluşturur.
 * of
 * Bir nesneyi Optinal ile sarmalar. Parametre olarak null değer kabul etmez.
 ofNullable
 Bir nesneyi Optinal ile sarmalar. Parametre olarak null değer kabul eder.
 */
public class createOptional {
  public static void main(String[] args) {
    Optional<Double> empty = Optional.empty();
    Optional<String> of = Optional.of("Merhaba Dünya");

    Optional<String> ofNull = Optional.of(null);
    //Optional#of null kabul etmez. İstisna fırlatır.
    Optional<Integer> ofNullable = Optional.ofNullable(null);
    //Optional#ofNullable null kabul eder. İstisna fırlatmaz.


  }

}
