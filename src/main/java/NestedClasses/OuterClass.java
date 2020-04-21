package NestedClasses;
//Varlığı başka classa bağlı olan alt classlar gibi düşünülebilir
//inner class static'te tanımlanabilir.

//SHADOWING  O DEĞİŞKENİN YAŞANILAN ALAN = SCOPE OF VARIABLE
//AYNI VARIABLE İSİMLE AYNI YERDE BİR VARIABLE DAHA TANIMLANIRSA BUNA SHADOWING DENİR

//EGER INNER CLASS STATIC OLMAZSA ICINDE STATIC METODDA TANIMLAYAMAYIZ


public class OuterClass {

  public  int x =0;

   class  FirstLevel{
    public int x =1;

    void methodInFirstLevel(int x){
      System.out.println("x= "+x);
      System.out.println("x= "+this.x);
      System.out.println("x= "+OuterClass.this.x);
    }


  }
  public static void main(String[] args) {

     /*FirstLevel firstLevel =new FirstLevel();
     OuterClass.FirstLevel firstLevel1 = new OuterClass.FirstLevel();
   */
     OuterClass st =new OuterClass();
    OuterClass.FirstLevel fl = st.new FirstLevel();
    fl.methodInFirstLevel(23);
  }
}
