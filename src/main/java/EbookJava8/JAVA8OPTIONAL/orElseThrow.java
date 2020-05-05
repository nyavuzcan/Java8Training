package EbookJava8.JAVA8OPTIONAL;

import java.util.Optional;

/**
 * Optional nesnesi bir değeri içeriyorsa (null olmayan) o değeri döndürür, null
 * ise de sağlanan istisna nesnesini fırlatır. orElseThrow metodu Supplier türünden
 * bir nesne kabul eder.
 */
public class orElseThrow {
  public static void main(String[] args) {
    Integer numara = null;
    Optional<Integer> opt = Optional.ofNullable(numara);
    int result = opt.orElseThrow(RuntimeException::new);

  }
}
