package HuaweiTest;
interface adf{
  public void  fn(int a);
}
class A {
  public void AMetho() { //MACHINE
    System.out.println("A METHODU CALISTI");

  }
}
   class B extends A{ //CAMERA
    public void BMethod(){
      System.out.println("B METHODU CALISTI");
    }
  }

  class  C extends A{
    public void CMethod(){
      System.out.println("C METHODU CALISTI");
    }

    public int AMethox(int Ab,int x) {
      System.out.println("overload int");
      super.AMetho();
   return 1;
    }
 protected   void AMethox(int c,String z) {
   System.out.println("overlaoad stringg");
      super.AMetho();
    }


  }





public class DOWUPCATSING {

  public static void main(String[] args) {

    C c = new C();
    c.AMethox(1,"123");
    c.AMethox(1,3131);

  A x1 = new A();
  B b1 = new B();

  A x2 = (B)b1;



    A a =(A)new B();

    B b = (B) new A();


    a.AMetho();
     }
}
