package EbookJava8.JAVA8OPTIONAL;

import java.util.Optional;

/**
 * Optional nesnelerinin sarmaladığı veriler üzerinde dönüştürüm yapılabilmektedir.
 * Bir önceki örneği bu şekilde yeniden yazabiliriz.
 */
public class MapDonusturme {
  public static void main(String[] args) {
    Integer numara = null;
    Optional<Integer> opt = Optional.ofNullable(numara);
    opt
        .map(num->Math.pow(num,2))
        .ifPresent(System.out::println);
  }
}
