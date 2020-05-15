package EncapsulationAndAnstraction;

public class sekretetCalisani extends calisan {
  static  int sayac =0;
  public sekretetCalisani(){
    sayac++;
  }//HER OBJE ÜRETİLİDĞİNDE SAYAC ORTAK BİR ŞEKİLDE ARTACAK

  @Override
  public void maas() {
    //ABSTRACT OLARAK TANIMLANAN MAAS METODU OVERRIDE EDİLDİ MECBURU

  }
  /*

  public void yetki(){
    BU METOD YAZILAMADI FİNAL TANIMLANDIGI İÇİN
  }*/
  //

}
//!!!!!!! HAFIZA TÜRLERİ
/*
FILE JAVA DOSYALARI
HEAP OBJELERİN DURDUGU YER
STACK SUB PROGRAMRAM FARKLI METHODLARIN BULUNDUGU
STATIC OOP'LERİN ALAYINDA VAR ÖZEL BİR HAFIZA ALANI
STATIC ÖZEL BİR HAFIZADA DURDUGU İÇİN CLASSIN DEĞİŞKENLERİNE
ORTAK ALANDAN ERİŞELİYOR
strictfp floatlı sayılar jvm'in durumuna göre farklı şekillerde
sonuc cıkarabiliyor fakat aynı sonucu almak için strictfp kullanılmalıdır
native =dili farklı diller kod yazmak için kullanılır.
transien = serialization atamoik yapılarda
volatile değişkenin geçici

 */
