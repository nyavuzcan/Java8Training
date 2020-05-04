package EbookJava8.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 *
 * Literatürde Lazy bir işlemin geç, ötelenmiş olarak yapılması iken, Eager ise
 * yapılacak işlemin emir verilir verilmez yapılmasını temsilen kullanılır.
 * Stream API içerisindeki bazı operasyonlar Lazy bazıları ise Eager olarak
 * koşturulmaktadır. Lazy davranışlı olan zincirli görevler, bir Eager operasyona
 * gelene kadar koşturulmamaktadır.
 */

public class LazyEager {
  public static void main(String[] args) {
    List<Integer> names = Arrays.asList(1,2,3,6,7,8,9);
     names
        .stream()
        .filter(Objects::nonNull)// LAZY
        .filter(n->n%2==1) // LAZY
        .map(n->n*2)//LAZY
       .forEach(System.out::println);   //!!!EAGER
    //BURADA FOR EACHE YANİ EAGERE GELENE KADAR KOD ÇALIŞMAYACAK
    //FORECAH GÖRDÜĞÜ ANDA 1,2,3 TETİKLENECEK ÇALIŞMA PRENSİBİ BU ŞEKİLDEDİR.

  }
}
