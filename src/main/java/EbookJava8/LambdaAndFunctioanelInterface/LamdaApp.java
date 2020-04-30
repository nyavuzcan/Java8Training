package EbookJava8.LambdaAndFunctioanelInterface;
/*
JAVA 8 ÖNCESİ METODA FONKSİYON PARAMETRE GEÇİRME;
 */
public class LamdaApp {
  public static void main(String[] args) {
    LamdaApp app = new LamdaApp();

    app.fonk(2, 3, new Anonim() {
      @Override
      public int call(int a, int b) {
        return a+b;
      }
    });
  }

  public int fonk(int a, int b,Anonim anonim){
    return anonim.call(a,b)*2;
  }
}
