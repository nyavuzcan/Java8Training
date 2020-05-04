package EbookJava8.STREAMAPI;

import java.util.stream.IntStream;

/**
 * Bir Stream içerisinden tekrarlı veriler çıkarılmak isteniyorsa distinct metodundan
 * faydalanılabilir.
 */
public class Distinct {

  public static void main(String[] args) {
    IntStream stream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 13, 8);
    stream
        .distinct()
        .forEach(System.out::println);

  }
}
