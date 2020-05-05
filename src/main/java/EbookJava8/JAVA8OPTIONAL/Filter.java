package EbookJava8.JAVA8OPTIONAL;

import java.util.Optional;

public class Filter {
  public static void main(String[] args) {
    String message = null;
    Optional<String> opt = Optional.ofNullable(message);
    opt
        .filter(m -> m.length() > 5)
        .ifPresent(System.out::println);
  }
}
