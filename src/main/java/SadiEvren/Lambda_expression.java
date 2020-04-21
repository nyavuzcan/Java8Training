package SadiEvren;

public class Lambda_expression {

  interface lamda{
    interface lambda{ //interface lambda ile java arası baglantıyı saglıyor

      int calistir(int x);
   //   int bol(int x);
    }

    public static void main(String[] args) {
lambda l = (int x)-> (x*x);
//lambda x = (int y)-> (y/y); 2.METHOD İÇİN 2.INTERFACE ZORUNLU
      System.out.println(l.calistir(l.calistir(5)));
    }
  }
}
