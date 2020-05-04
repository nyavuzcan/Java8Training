package EbookJava8.STREAMAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**stream() metodu ile elde edilen Stream nesnesi yapacağı işlemleri ardışıl
 olarak yaparken, parallelStream() metoduyla elde edilen Stream nesnesi, bazı
 operasyonları paralel olarak koşturabilmektedir.

 Stream arayüzü içindeki metodlardan ardışık işletilmesi gerekmeyenler, istenirse,
 CPU üzerinde paralel olarak koşturulabilmektedir. Bu sayede CPU çekirdeklerini
 tam verimli olarak kullanmak mümkün olmaktadır.
 *
 */
public class parallelStream {
  public static void main(String[] args) throws IOException {
    List<String> names = Arrays.asList("Ali","Veli","Selami");
    Stream<String> stream = names.stream();
    Stream<String> parallelStream = names.parallelStream();

//Java içerisindeki bazı I/O sınıfları üzerinden Stream nesneleri elde
//edilebilmektedir.
  //  Path dir = Paths.get("/var/log");
    //Stream<Path> pathStream = Files.list(dir);
    List<Integer> ints = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
    Stream<Integer> streamL = ints.stream(); // Ardışıl
    Stream<Integer> parallelStream2 = streamL.parallel(); // Paralel

    List<Integer> ints1 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15);
    Stream<Integer> parallelStream3 = ints.parallelStream(); // Paralel
    Stream<Integer> stream2 = streamL.sequential(); // Ardışı


    //EXAMPLES

    List<Integer> listem = Arrays.asList(1, 5, 3, 7, 11, 9, 15, 13);
    listem
        .parallelStream() // Paralel Stream
        .filter(Objects::nonNull)
        .filter(n->n>0) //pozitiff sayı ise
         .sorted()
        .forEach(System.out::println);
  //BURADA RANDOM DEGERLER GELECEK O SEBEPLE İŞLEM YAPILDIKTAN SONRA ARDIŞIL
    //STREAMe ÇEVİRİLİP FOREACH UYGULANMALIDIR
    List<Integer> listem2 = Arrays.asList(1, 5, 3, 7, 11, 9, 15, 13);
    listem2
        .parallelStream() // Paralel Stream
        .filter(Objects::nonNull)
        .filter(n->n>0) //pozitiff sayı ise
        .sorted()
        .sequential()
        .forEach(System.out::println);

  }
}
