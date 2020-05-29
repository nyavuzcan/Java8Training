package HackerRank.RepeatedString;

import java.util.Arrays;

public class Solution {
  static long repeatedString(String s, long n) {
    if (s.length()==1 && s.equals("a"))
      return n;

    String arr[] =   s.split("");

    long divide =  (n/s.length());
    long remain =  (n%arr.length);

   long count=  Arrays.stream(arr).filter(x->x.equals("a")).count();

   count*=divide;

    for (int i =0 ; i<remain ; i++){
      if (arr[i].equals("a")){
        count++;
      }
    }
return count;
  }

  public static void main(String[] args) {
    System.out.println(repeatedString("ceebbcb",817723));
  }
}
