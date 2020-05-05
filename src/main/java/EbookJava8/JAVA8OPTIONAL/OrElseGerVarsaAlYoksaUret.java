package EbookJava8.JAVA8OPTIONAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Bu metod orElse metoduna çok benzer, fakat orElseGet metod parametresi
 * olarak Supplier fonksiyonel arayüzü türünden nesne kabul eder.
 */
public class OrElseGerVarsaAlYoksaUret {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Ali","Veli","Selami",null);
    Optional<List<String>> opt = Optional.ofNullable(names);
    names = opt.orElseGet(()-> new ArrayList());
    names = opt.orElseGet(ArrayList::new);
  }
}
