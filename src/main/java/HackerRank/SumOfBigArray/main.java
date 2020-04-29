package HackerRank.SumOfBigArray;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class main {
  static double sum(long[] ar){
       List<Long> list = stream(ar).boxed().collect(Collectors.toList());

    return list.stream().mapToLong(Long::longValue).sum();

  }
  public static void main(String[] args) {
    long [] ar ={12,351,45,123,123,21,3};
    System.out.println(sum(ar));
  }
}
