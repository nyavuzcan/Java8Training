package coreJavaTest;

interface TestInterface{
  default  void isRequired(int i) {
    System.out.println(i);
  }
}

public class defaultMethodTest  {


  public static void main(String[] args) {
    defaultMethodTest defaultMethodTest = new defaultMethodTest();
    defaultMethodTest.runnable.run();
    coreJavaTest.defaultMethodTest.InnerClasss innerClasss = new  InnerClasss();
  }

  Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
      System.out.println("Burada nasıl");
    }
  });   //CALISMADI

  static class InnerClasss implements Runnable{

    @Override
    public void run() {
      System.out.println("Burası calısyomu");
        //BURASI CALISMADI
    }
  }


  Runnable runnable = new Runnable() {
    @Override
    public void run() {
      System.out.println("asdas");
    }
  };

}