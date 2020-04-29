package HackerRankJava.ifElse;

public class MainTest {
  public static void main(String[] args) {
    int n =20;
    if (n%2!=0){
      System.out.println("Weird");
    }else if (2<n && n<5){
      System.out.println("Not Weird");
    } else if (6<n && n<=20){
      System.out.println("Weird");
    }else if (n>20)
      System.out.println("Not Weird");
  }
}
