package SadiEvren;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class STREAM {

  //STREAM BİR AKAN VERİ YAPAISI VE BUNA LAMDA EXPRESSİON İLE BİRLESTİRİYORUZ
  //STREAM PIPELİNE
  //1 KAYNAK- DİZİ- GİRİŞ CIKI I/O,
  //2 BİR İŞLEM MAP, FİLTER, GİBİ
  //MAP BÜTÜN ELEMANLARA SENİN İŞLEMİNİ UYGULA
  //FİLTER BOOLEAN EŞİTSE AL EŞİT DEĞİLSE ALMA FİLTRELEME İŞLEMİ
  //
  //3 SONLANDIRMA

  public static void main(String[] args) {
    List<Integer> listem = Arrays.asList(1,2,3,4,5);
    int sayi =    listem.stream().map(x->x*x).reduce((x,y)->x+y).get();

    //REDUCE BİR TARAFTA KARESİNİ ALIP BİRİKTİRİP DAHA SONRA REDUCE YAPIYOR
    //
    System.out.println(sayi);
  }

}
