package EbookJava8.STREAMAPI;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * Stream arayüzü BaseStream arayüzünden türemektedir. Stream arayüzüne
 * benzer biçimde IntStream, DoubleStream ve LongStream arayüzleri de
 * BaseStream arayüzünden türemektedir.
 * Stream arayüzü türünden nesneler tüm veri tipleriyle çalışmak için oluşturulan
 * bir arayüzken, buradaki üç eleman ise, sadece sınıf başındaki tip ile özel olarak
 * çalışmak için oluşturulan arayüzlerdir.
 */
public class IntDoubleLongStream {
  public static void main(String[] args) {
    IntStream intOf = IntStream.of(1, 2, 3);
    IntStream intRange = IntStream.range(1, 10);
    DoubleStream doubleOf = DoubleStream.of(1.0, 3.5, 6.6);
    LongStream longOf = LongStream.of(3, 5, Long.MAX_VALUE,9);
    LongStream longRange = LongStream.range(1, 100);
  }
}
