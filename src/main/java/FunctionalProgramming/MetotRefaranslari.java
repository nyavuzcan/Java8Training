package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class MetotRefaranslari {
  /*
  Metot referansları ile bir fonksiyonu lamda beklenen yere
  döndürmek mümkündür.
  Lamda için tanımlamam fonskiyon interface ile metodum imzası tutşmak
  zorundadır

   */

  public static void main(String[] args) {
    /*
    static  ClassName::StaticMethodName  String::valueOf
    constuructr   Classname::new   Arraylist::new
    specific object   objectRef::Methodname   x::toString

    arbiratr object o f given type ClaassName::Instacemetdo   Object::toString


     */

    List<Integer> arrList= Arrays.asList(1,2,3,4,5);

    arrList.forEach(System.out::println);
    //Method ÇAĞIRILMIYOR
    //mETHOD ' A PARAMETRE VERİLMİYOR
    //! METHOD'A PARAMATRE OLARAK GECİYOR !!
    //O METHODUN REFERANSI PARAMETRE OLARAK VERİLEREK GEÇİRİLİOYR
    // YA LAMDA EKSPRESSİON İLE METHOD TANIMLAMA
    // YA DA OLAN METHODUN CLASS :: METHODNAME İLE PARAMETRE OLARAK GEÇİRME

    /*
    !!!!!! STREAM API
    STREAM AKAN BORU HATTI GİBİ BİZ BUNU LAMDA EXPRESSİON İLE BİRLEŞTİRİYORUZ
    1-)KAYNAK DİZİ COLECTOPN I/O =STREAM
    2-)BİR İŞLEM TANIMANALANACAK HER BİRİNİE UYGUALANACAK BİR FONKSİYON MAP|FİLTER
    FILTER BOOLEAN DÖNDÜRÜYOR. ALIYOR
    3-)SONLANDIRMA İŞLEMİ
     */


  }

  List<Integer> list = Arrays.asList(1,2,3);
  int sum = list.stream().map(x->x*x).reduce((x, y)->x+y).get();


}
