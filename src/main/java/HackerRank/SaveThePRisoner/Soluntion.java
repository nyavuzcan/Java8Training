package HackerRank.SaveThePRisoner;

public class Soluntion {
  static int saveThePrisoner(int n, int m, int s) {

      // Complete this function
      int a = s+m-1;
      if(a>n){
        if(a%n==0){
          return n;
        }
        return a%n;
      }

      return a;

  }

  public static void main(String[] args) {
    System.out.println(saveThePrisoner(7,19  ,2));
  }
}
