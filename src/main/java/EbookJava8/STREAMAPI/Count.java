package EbookJava8.STREAMAPI;

import java.util.stream.IntStream;

/**
 * Stream içerisindeki eleman sayısını hesaplar.
 *
 */
public class Count {

  public static void main(String[] args) {
    IntStream range = IntStream.range(1, 10);
    IntStream rangeClosed = IntStream.rangeClosed(1, 10);
    System.out.println(range.count());
    System.out.println(rangeClosed.count());
  }
}
