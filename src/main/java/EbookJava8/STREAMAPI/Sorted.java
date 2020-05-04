package EbookJava8.STREAMAPI;

import java.util.stream.IntStream;

/**
 * Stream içerisindeki yığınsal verinin sıralanmış Stream nesnesini döndürür.
 */
public class Sorted {


  public static void main(String[] args) {
    IntStream stream = IntStream.of(13, 1, 3, 5, 8, 1, 13, 2, 8);
    stream
        .sorted()
        .forEach(System.out::println);
  }
}
