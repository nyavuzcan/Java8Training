package HackerRankJava.BigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
  public static void main(String[] args) {

    Comparator<String> customComparator = new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        BigDecimal a = new BigDecimal(s1);
        BigDecimal b = new BigDecimal(s2);
        return b.compareTo(a); // descending order
      }
    };

    String[] s={"000.000","0.12"};
 Arrays.sort(s, 0, 2, customComparator);

    //Output
   /* for (int i = 0; i < n; i++) {
      System.out.println(s[i]);
    }
*/
  }
}
