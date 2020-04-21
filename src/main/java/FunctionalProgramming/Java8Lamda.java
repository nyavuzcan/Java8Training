package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class Java8Lamda {

  /*
  Fonnksiyonle programlama geldi
  Ekonimik kodlama daha kısa
  Paralel kodlama
  Generik, esne ve yeniden kullanılabilir apı ;
  generic flexiable, reusable;

  Verinin dışında davranışın foknsinunun fonksyinolara parametre geçirilmesi


   */
/*
!!!!
    JAVA 8 GEÇMİŞİ DESTEKLEMEK AMAÇLI NATİVE OLARAK LAMDA EXPRESSİON OLARAK
    KALMIYOR. LAMDALARI BİRER FONKSİYONA ÇEVİRİR.
    ÖRNEĞİN x-> Syste.printl(x)

    public static void genName(Integerb x){
    sout.)
    çevirliyor elbette burda type vs sorunları oluşuyor uzun ugraslar sonucu fonksiyon tipi

    yapılmış ilemler.


   Çözüm olarak interfaceler kullanımlış
 */
  public static void main(String[] args) {

    List<Integer> intSeq = Arrays.asList(1,2,3,4,5);
    //Array'i listey çeviriyor

    Integer arr []={1,2,3,4,5};
    List<Integer> listarr= Arrays.asList(arr);

    listarr.forEach(x-> System.out.println(x));
    //Her bir elemana, ASLINDA FOR EACH FONSKIYONUNA
    //SYSTEM OUT FONSKYIONUNU PARAMETRE VERİYOR;
    int z =3;
    listarr.forEach((Integer x)->{ //Birden fazla satır olacaksa {} kullanılacak
      int y =x+2+z;
      System.out.println(y);
    });


  /*
    util.function içinde yeni interface tipleri bulunmaktadır
    Runnalbe Comparable Callable
    Java 8 lamdaları mevcut kodlarla birlikte çalışmalıdır
   */
    /*
    Lamda expression içerisinden dışardan erişebiliyoruz.

     */

    }




}
