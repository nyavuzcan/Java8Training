package HackerRank.ModeFindinList;

import java.util.*;
import java.util.stream.Collectors;

public class test {

  static int birthdayCakeCandles(int[] ar) {
    List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());

    Map<Integer, Integer> map = new HashMap<>();
    for (Integer i : list) {
      if (Objects.nonNull(map.get(i))) {
        map.put(i, map.get(i) + 1);
      } else map.put(i, 1);
    }

    return map.values().stream().max(Integer::compareTo).get();

  }

  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 3,3,3};
    System.out.println(birthdayCakeCandles(arr));
  }
}
