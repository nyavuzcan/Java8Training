package EbookJava8.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Stream türünden nesneler, yığın verileri temsil eden özel nesnelerdir. Fakat
 * Stream biçimi bir veri yapısı sunmamaktadır. collect metodu ağırlıklı olarak ,
 * Stream nesnelerini başka biçimdeki bir nesneye, veri yapısına dönüştürmek için
 * kullanılmaktadır.
 * Stream#collect metodu Collector türünden bir parametre kabul etmektedir.
 * Bu parametre ile istendik türe dönüşüm sağlanmaktadır. Collector türünden
 * arayüzler, Collectors sınıfının çeşitli statik metodlarıyla elde edilebilmektedir.
 */
public class Collect {

  public static void main(String[] args) {
    List<String> names =
        Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");
    List<String> list = names.stream().collect(Collectors.toList());
    Set<String> set = names.stream().collect(Collectors.toSet());
    Long count = names.stream().collect(Collectors.counting());

    String collect = names.stream().collect(Collectors.joining(" - "));

    System.out.println(collect);

    Map<Integer, List<String>> integerListMap =
        names.stream().collect(Collectors.groupingBy(name ->
            name.length()));
  //UZUNLUKLARI AYNI OLANLARI GRUPLADI
    integerListMap.values().forEach(System.out::print);
  }
}
