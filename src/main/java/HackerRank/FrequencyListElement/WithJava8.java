package HackerRank.FrequencyListElement;

import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public class WithJava8 {
  static int migratoryBirds(List<Integer> arr) {

    Map<Integer, Integer> frequencies = arr.stream()
        .collect(toMap(identity(), v -> 1, Integer::sum));

    List<Integer> maxls= Collections.singletonList(frequencies.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .get()
        .getKey());
  return maxls.stream().findFirst().get();

  }
  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(1,1,3,3,3,2,2,2,4,4,4,1,5,6,7);
    System.out.println(migratoryBirds(ls));

  }
}
