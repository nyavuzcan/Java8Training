package SadiEvren;

import java.util.Arrays;
import java.util.List;

public class SampleForEach {

  public static void main(String[] args) {
    List<Integer> intSeq = Arrays.asList(1,2,3,4);

    intSeq.forEach((Integer x)-> System.out.println(x));// ASLINDA LAMDA FOKNSİYONU ATADIK
    //TİP ATAMASIDA YAPILABİLİR intSeq.forEach((Integer x)-> System.out.println(x));// ASLINDA LAMDA FOKNSİYONU ATADIK
    intSeq.forEach(System.out::println);//METHOD'UN KENDİSİ BİR PARARMETRE OLARAK VERİLİYOR
    //FOREACH İÇİNE PARAMETRE VERİYORUZ
    //POİNTER GİBİ
    intSeq.forEach(x->{
      int y=x+2;
      System.out.println(x);
      System.out.println(y);

    });//ÇOKLU SATIR
  }

  public void yazdir(){
    System.out.println("TEST");
  }
}
