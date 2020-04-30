package EbookJava8.FunctionalInterface;

/**
 * Tek bir soyut metodu bulunan arayüzlere fonskyionel
 * interface denir.
 *
 * fn(x,y) → 2*x + y java ile ifade ederiz ?
 *
 */
public class mai {

  public static void main(String[] args) {
    //Direk olarak metoda body tanımlaması yaptık
    //Eğer birden fazla tanımlama olsaydı çalışmayacaktı.
    //Java da metodlar tek bşalarına anlam ifade etmediği için
    //bir interface ile tanımlama yapılıoy.r
    Foo foo =((x, y) -> 2*x+y);
    int sonuc = foo.apply(3,4);
    System.out.println(sonuc);
  }
}
