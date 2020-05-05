package EbookJava8.JAVA8OPTIONAL;

import java.util.Optional;

/**
 * Eğer bir Optional içerisinde sadece veri varsa (null değilse) bir işin yapılması
 * isteniyorsa #ifPresent metodu kullanılabilir. #ifPresent metodu Consumer<T>
 * fonksiyonel arayüzü türünden bir nesne kabul
 */
public class ifPresent {
  public static void main(String[] args) {
    Integer numara = null;
    Double karesi = Math.pow(numara , 2);
    System.out.println("Sonuç: " + karesi);
    if(numara != null) { //ÖNLEM ALDIK FAKAT
      Double karesia = Math.pow(numara , 2);
      System.out.println("Sonuç: " + karesi);
    }
    /**Fakat if deyimiyle birlikte ! , == , != ifadelerini kullanmak akıcı bir geliştirim
     deneyimi sunmaz. Ayrıca bu durum hata yapılmasına daha açıktır. Bunun yerine
     Optional#ifPresent metodunu kullanabiliriz.
     *
     */
    //Null degeler için calıstırmayacak.
    Integer num = null;
    Optional<Integer> opt =Optional.ofNullable(numara);
    opt.ifPresent(numx->{
      Double kare =Math.pow(numx,2);
      System.out.println(kare);
    });
  }
}
