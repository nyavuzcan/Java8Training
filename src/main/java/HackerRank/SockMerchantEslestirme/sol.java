package HackerRank.SockMerchantEslestirme;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class sol {
  static int sockMerchant(int n, int[] ar) {
    List<Integer> arr = stream(ar).boxed().collect(Collectors.toList());

    Map<Integer, Integer> frequencies = arr.stream()
        .collect(toMap(identity(), v -> 1, Integer::sum));
 List<Integer>lx= frequencies.values().stream().filter(x->x>1).map(x->x/2).collect(Collectors.toList());

 return lx.stream().mapToInt(Integer::intValue).sum();
  }

  public static void main(String[] args) {

    int n= 9;
    int ar[]={10,20,20,10,10,30,50,10,20};

    System.out.println(sockMerchant(n,ar));

  }
}
