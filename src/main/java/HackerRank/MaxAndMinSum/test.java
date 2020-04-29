package HackerRank.MaxAndMinSum;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {

  static void miniMaxSum(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    Collections.sort(list);



    Long Sum = Arrays.stream(arr).boxed().mapToLong(Integer::intValue).sum();
  long minSum = Sum-list.get(list.size()-1);
  long MaxSum = Sum-list.get(0);

    System.out.println(minSum+ " "+ MaxSum);

  }

  public static void main(String[] args) {
    int [] arr= {256741038,623958417,467905213,714532089,938071625};
    miniMaxSum(arr);
  }
}
