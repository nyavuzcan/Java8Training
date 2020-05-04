package EbookJava8.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *Stream içindeki yığınsal olarak bulunan her bir veriyi dönüştürmeye olanak tanır.
 * Dönüştürüm işlemi Stream içerisindeki her bir öğe için ayrı ayrı yapılmaktadır.
 * Stream#map metodu Function türünden bir parametre beklemektedir.
 *
 */
public class Map {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Cem");

    names
        .stream()
        .map(name -> name.toUpperCase())
        .forEach(System.out::println);

    //Herbirinin karesi
    IntStream
        .rangeClosed(1, 5)
        .map(n -> n*n)
        .forEach(System.out::println);
  }
}
