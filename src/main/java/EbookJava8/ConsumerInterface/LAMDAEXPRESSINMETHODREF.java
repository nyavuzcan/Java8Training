package EbookJava8.ConsumerInterface;
//LAMDA EXPRESSİN METHOD REFERANCE İLE KULLANMA

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LAMDAEXPRESSINMETHODREF {
  public static void listele(String e){
    System.out.println(e);
  }

  public static void main(String[] args) {
    //RETURN VE PARAMETRELER BİREBİR AYNI REF İÇİN CONSUMER KULLANILABİLİR
    Consumer<String> consumer = LAMDAEXPRESSINMETHODREF::listele;
    consumer.accept("SELAMLAR");

    //Bir metodu referans olarak kullanabilmek için
    List<String> names = Arrays.asList("Ali", "Veli", "Selami");

    names.forEach(LAMDAEXPRESSINMETHODREF::listele);
    names.forEach(System.out::print);
// veya
    names.forEach(System.out::println);
  }

}
