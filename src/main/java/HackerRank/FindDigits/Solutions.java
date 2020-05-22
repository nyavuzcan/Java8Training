package HackerRank.FindDigits;

import java.util.ArrayList;
import java.util.List;

public class Solutions {
  static int findDigits(int n) {
    int division=n;
    List<Integer> integers=new ArrayList<>();
    while (n!=0){
      int mod = n%10;
      integers.add(mod);
      n= (n-mod)/10;

    }
    return (int) integers.parallelStream().filter(x->x!=0).filter(x->division%x==0).count();


  }
  /* static int findDigits(int n) {
   String dg=String.valueOf(n);
   String[] arr=dg.split("");

   int count =0;
   for (String a: arr){
     try {
       if (n%Integer.valueOf(a)==0)
         count++;

     }catch (ArithmeticException arithmeticException){
       continue;
     }

   }
return count;
  }
*/
  public static void main(String[] args) {
    System.out.println(1/11);
    System.out.println(findDigits(1012));
  }
}
