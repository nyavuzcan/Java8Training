package EbookJava8.MethodReference;

/**
 * Metodlara erişimin ise statik olup olmadığına göre iki erişim biçimi vardır.
 * Statik metodlara sınıf üzerinden erişilebilirken, statik olmayan metodlara nesne
 * üzerinden erişim sağlanabilmektedir.
 * Java 8 ile beraber metod birimleri, bir lambda ifadesine, dolayısıyla bir fonksiyonel
 * arayüze karşılık olarak referans verilebilmektedir.
 */

import EbookJava8.ConsumerInterfaceBefore.Java8.Consumer;

import java.util.Arrays;
import java.util.List;

/**
 Önemli olan girdi ve çıktısı fonksiyonel interface metodunun girdi ve çıktıasna
 birebir uyuyorsa kullanılabilir.
 */

/**
 *
 * Consumer<String> consumerWithMetRef = <ClassName>::herhangiBirMetod;
 * Statik methodalar için
 *
 * Statik olmaynalar için
 * Consumer<String> consumerWithMetRef = <ObjectRef>::herhangiBirMetod;
 */
public class info {
  public static void main(String[] args) {
    Consumer<String> consumerx =e-> {
      System.out.println(e+" Girdi Var Cıktı yok");
    };

    consumerx.accept("test");


    consumerx=info::consumerYerine;

    consumerx.accept("asd");



  }

  public static   void consumerYerine(String s){
    System.out.println(s+" Consumer yerine ref veerildi");
    List<String> names= Arrays.asList("Ali,Veli,Selami");
    names.forEach(s1 -> {
      System.out.println(s1);
    }); //ASLINDA BURDA İÇİNE ALINAN İFADEDE CONSUMER GİBİ OLUYOR ÇÜNKÜ İNPUT VE OUTPUT AYNI TÜR

  }
}
