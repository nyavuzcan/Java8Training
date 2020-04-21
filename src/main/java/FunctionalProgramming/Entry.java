package FunctionalProgramming;
//Doğal Sayılar üzerinde tanımlı bir fonksiyon ve
//bir insan tarafından hesaplanabilir ancak ve ancak Turing makinesi tarafından
//hesaplanabilirse. Turing hesaplar insanda hesaplar- tam terside.
//hesaplanabilir foknsiyonlar teorisi

//Bu kod yazılamaz. Bir fonksiyonun yazılıp yazılamayacağı

/*
expr-> ^var.expr | expr expr | var | (expr)
       lamba var demek değişkeni ver fonksiyonu cağır anlamaında
 */
public class Entry {
  public static void main(String[] args) {
    lambda lambda = (x) -> (x * x);
    //yukardaki interfacein body'si yok burda lamda'nin body'sini
    //tanımladık ve daha sonra o tanımlaadan metoda parametre gecirdik
    //!!HER FARKLI PARAMETRE İÇİN YENİ BİR İNTERFACE TANIMLANARAK METOD
    //ORADA TANIMLANMALIDIR
    /*
    !!!!!!!!!!!!!!!!!!!!

      FONSKİYONEL PROGRAMLAMA
      impretive dili değildir emirci C
      Matematiksel fonskiyon gibi düşnülür yapılan her işlem
      SİDE EFFECT AZILMIŞTIR

      Programlama dillerinde farklı ifadelerin hangi
      anlamlara geldigini anlam karmaşasını side effect azaltmak
      i=3
      if(i=3)
      hangi anlama geldigi gibi
      oysa functionalde x-> x*x her zaman -> bu işlem atama anlamına gelmektedir


      3-) Veriyi değişmez olarak kabul eder. İMMUTABLE
        örnek
        String s ="deneme";
        değiştirielemez;
        s="ali"
        burda dememeyi bırakıp yeni bir yerde ali oluşturup oraya gösterir

        s.charAt(3)='K' ataması yapılamaz çünkü değiştireilemz

        Functional dillerde hiçbir değişken değiştirilemez

        4-)Referential Transparancy (Komutların erişim şeffaflığı vardır)
          Bir programın yerine baska şekilde bir fonskiyon yazabiliyorsak

          int j=5;
          System.out.println(""+j*j); = sot(25) aynı anlama gelimce transpancy var

            Olmayan örnek
            int gv=5;
            int(i){
            gv*5)   gv değişebilir o yüzden sabit yazamayız.

          5-) Fonksiyonlara fonksyionlar parametre verilebilir.

          6-) Döngüler yerine recursive fonksiyonlar kullanılır





     */

    System.out.println(lambda.calistr(5));

    lamda_run Run=(x, y) -> {
      System.out.println(x-y);
      return x;
    };

    Run.runInt(2,1);

  }

  interface lambda {
    int calistr(int x);
  }

  interface lamda_run {
    int runInt(int x, int y);
  }

}
