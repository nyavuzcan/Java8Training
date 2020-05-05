package EbookJava8.JAVA8OPTIONAL;

import java.util.Optional;

/**
 * Varsa al, yoksa bunu al
 */
public class OrElse {
  public static void main(String[] args) {
    Integer numara = null;
    int result = (numara != null) ? numara : 0;

    Optional<Integer> opt = Optional.ofNullable(numara);
    int resultx = opt.orElse(0);


  }
}
