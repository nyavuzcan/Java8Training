package ObjectClassExamples;

import java.util.Objects;

class insan{
  int boy;
}

//CLONLAMA İÇİN CLONEABLE INTERFACE İMPLEMENT ETMEK LAZIM.
class ogrenci extends insan implements Cloneable {
  Object kopyala() throws CloneNotSupportedException {
    return this.clone();


  }
  public String toString(){
    return null;
  }

  //public yapmayınca default = protected yapıyor.
}
//STRING

public class ObjectExample {
  public static void main(String[] args) throws CloneNotSupportedException {

    String a ="asd";
    String b ="asd";

    String c = new String("asd");
    if (a==c){ //C =NONPOOL
      System.out.println("esit");
    }
    if (a.equals(c)){
      System.out.println("equal");
    }

    insan ahmet = new insan();
    insan ali = new insan();
    ahmet.boy=30;
    ali.boy=30;


    ahmet=ali; // SHALLOW COPY (SIĞ KOPYALAMA)
    ahmet.boy=3;
    if (ahmet==ali){ //AYNI ADRESSİ REFERENCE EDİYORLAR.
      System.out.println("Ali: "+ali.boy);
      System.out.println("Ahmet: "+ahmet.boy);
      System.out.println("tru");
    }

    ogrenci ayse = new ogrenci();
    ogrenci veli =(ogrenci) ayse.kopyala(); //DEEP COPY

    if (veli == ayse){
      System.out.println("Esitler");
    }

    System.out.println(ayse.toString());//Detaylı obje özelliklerini
    System.out.println(ayse);//Detaylı obje özelliklerini //yukardakıyle aynı
    System.out.println(ayse.hashCode());//her objeyi ayırt etmek için hash code

  }

}
