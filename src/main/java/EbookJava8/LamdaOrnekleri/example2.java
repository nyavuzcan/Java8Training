package EbookJava8.LamdaOrnekleri;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**Supplier Arayüzü
 *@FunctionalInterface
 * public interface Supplier<T> {
 * T get(); // () -> t
 * }
 * Hiç parametre almaz, T tipinde bir değer döndürür. Factory pattern için uygundur.
 */
public class example2 {
  public static void main(String[] args) {
    Supplier<List> supplier = () -> new ArrayList<>();
    List<String> liste = supplier.get();

    liste.add("Ali");
    liste.add("Veli");
    liste.add("Selami");
  }
}
