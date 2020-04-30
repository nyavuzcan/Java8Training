package EbookJava8.ConsumerInterface;

import EbookJava8.ConsumerInterfaceBefore.Java8.Consumer;

import java.util.Arrays;
import java.util.List;

public class afterJava8 {
  public static void main(String[] args) {
    java.util.function.Consumer<String> stringConsumer =s->{
      System.out.println(s);
    };

    Consumer<String> consumer = (String s)-> {
      System.out.println(s);
    };

  consumer.accept("merhaba dünya");
  /** istenirse s-> {
   şeklinde de yazılabilir
   }
   * Lambda deyimlerinde odaklanması gereken nokta, fonksiyonel arayüzün tek
   * metodunun sahip olduğu metod girdi tipi, sayısı,sırası ve metod çıktı
   * tipidir.
   * Bu sayede kod satırı olarak tasaruf edilmektedir.
   */
/**
 * CONSUMERE INTERFACEI ITERABLE INT İÇİNDE FOREACH METODUNDA
 * KULLANILIR. FOR EACH ÖNCE NULL KONTROLĞĞ YAPAR VE DAHA SONRA VERİ
 * TİP ÜZERİNDEN TÜKETİM YAPAR.
 */

    List<String> names = Arrays.asList("Ali", "Verli","Selam");
    names.forEach(stringConsumer);
    //veya
    names.forEach(e->{
      System.out.println(e);
    });




  }
}
