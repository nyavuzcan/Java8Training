package EbookJava8.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Stream içerisindeki yığınsal veri üzerinde süzme işlemi yapar.
 * Predicate arayüzü
 * türünden bir parametre ile filtreleme işlemini yapar.
 */
public class Filter {

  public static void main(String[] args) {
    List<String> names =
        Arrays.asList("Ali", "Veli", "Selami", "Cem", "Zeynel", "Can", "Hüseyin");

    Stream<String> stream = names.stream();

    Predicate<String> predicate = name -> name.length()<4;

    Stream<String> filtered = stream.filter(predicate);

    filtered.forEach(System.out::println);

    /**
     * Stream nesneleri tek kullanımlıktır. Stream nesnesinin çoğu
     * metodu yeni bir Stream nesnesi sunmaktadır. Bu sebeple
     * tüm operasyonlar zincirlemeli olarak yapılabilmektedir.
     */
    names
        .stream()
        .filter(name -> name.length() == 4)
        .forEach(System.out::println);
  }
}
