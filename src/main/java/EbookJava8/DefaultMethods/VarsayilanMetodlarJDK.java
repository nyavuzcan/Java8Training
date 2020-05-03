package EbookJava8.DefaultMethods;

import java.util.Collection;
import java.util.Collections;

/**JDK 1.8 içerisinde bazı noktalarda varsayılan metodlar kullanılmaktadır.
 java.util.Collection arayüzünde bunu fazlaca görmekteyiz.
 *
 */
public class VarsayilanMetodlarJDK {/**

 Collection sınıfı içindeki removeIf, stream, parallelStream ve spliterator
 metodları varsayılan metodlardır. Bu sebeple Collection türünden tüm nesneler
 bu varsayılan metodları miras alarak tüketebilmektedir.

 */
public static void main(String[] args) {

  /**
   * @FunctionalInterface
   * public interface Iterable<T> {
   * Iterator<T> iterator();
   * default void forEach(Consumer<? super T> action) {
   * Objects.requireNonNull(action);
   * for (T t : this) {
   * action.accept(t);
   * }
   * }
   * }
   */

  //BURDAKI FOREACH VE COOLLECTIONS DA Kİ REMOVEIF METHODLARI
  //DEFAULT OLARAK TNAIMLANMIS VE GÖVDESİ VAR BÖYLECE
  //COLLECTION TÜRÜNDEN TÜM NESNELER BU VARSAYILAN METODLARI MİRAS OLARAK
  //KULLANIP OVERRİDE EDEBİLMEKTEDİR.
}
}
