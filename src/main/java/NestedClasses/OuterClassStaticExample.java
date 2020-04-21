package NestedClasses;
//Eğer Fakülteden bagımsız veya birden fazla fakülteye
//bagımlı olabiliyorsa onu Inner yapamayız
//Inheritannce ile Inner arasında en büyük fark özellikler
//extends edilen yerden alınsada, Kendi başına bir varlık ifade
//edebiliyor. Çalışan- Müdür ilişkisi gibi.
//INNER CLASS'A ERİŞEBİLMEK İÇİN MUTLAKA
//OUTER CLASS'TAN OBJE OLMALI.


//LOCAL CLASS HER HABGİ BİR BLOKTA {} METHOD İÇİ GİBİ
//OLUŞTURULAN CLASSLAR
public class OuterClassStaticExample {

  public  int x =0;

  static class  FirstLevel{
    public int x =1;

    void methodInFirstLevel(int x){
      System.out.println("x= "+x);
      System.out.println("x= "+this.x);

    }

//!!!STATIC CLASSLARA DİREK KENDİ ADIYLA ERİŞİM SAĞLANABİLİR
    //AMA STATİC OLMASAYDI OUTER ÜZERİNDEN GİDECEKTİK.
  }
  public static void main(String[] args) {

     FirstLevel firstLevel =new FirstLevel();
    //OuterClassStaticExample.FirstLevel firstLevel1 = new OuterClassStaticExample.FirstLevel();
   //aynı üsttekiyle

    //firstLevel.x;
  }
}
