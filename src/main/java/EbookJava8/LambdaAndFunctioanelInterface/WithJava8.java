package EbookJava8.LambdaAndFunctioanelInterface;

public class WithJava8 {

  public int fonk(int a, int b,Anonim8 anonim8){
    return anonim8.call(a,b)*2;
  }

  public static void main(String[] args) {
    WithJava8 withJava8 = new WithJava8();
    withJava8.fonk(2,3,((a, b) -> a+b));
  }

}
