package HackerRank.DivedeChocolateBar;

import java.util.Arrays;
import java.util.List;

public class HMain {
  static int birthday(List<Integer> s, int d, int m) {
    int sum =0;
    int count =0;
    for (int i  = 0; i<s.size();i++){
      for (int j=i; j<m;j++){
        sum+=s.get(j);
      }
      if (sum==d)
        count++;
      sum =0;
      m++;
      if (m>s.size())
        return count;
    }
return count;
  }

  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(2 ,3, 4, 4, 2, 1, 2, 5, 3, 4, 4, 3, 4, 1, 3, 5, 4, 5, 3, 1,
        1, 5, 4, 3, 5, 3, 5, 3, 4, 4, 2 ,4 ,5, 2, 3, 2, 5, 3, 4, 2, 4, 3 ,3 ,4 ,3 ,5 ,2, 5, 1, 3, 1 ,
        4, 2, 2, 4, 3, 3, 3, 3, 4, 1, 1, 4, 3, 1, 5, 2, 5, 1, 3, 5, 4, 3, 3, 1, 5, 3, 3, 3, 4, 5 ,2);
    System.out.println(birthday(ls,26,8));
  }
}
