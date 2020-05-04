package EbookJava8.STREAMAPI;

import java.util.stream.LongStream;

/**
 * Bir Stream yığını içerisindeki ilk N veri barındıran yeni bir Stream nesnesi
 * sunmaktadır.
 */
public class Limit {
  public static void main(String[] args) {
    LongStream range = LongStream.range(1, 10000);
    range
        .limit(10)
        .forEach(System.out::println);
  }

}
