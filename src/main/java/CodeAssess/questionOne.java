package CodeAssess;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.toMap;

import static java.util.function.Function.identity;
public class questionOne {

  /**
   *    int max = 1;
   *     Map<Integer, Integer> nums = new HashMap<>();
   *     for (int i : a)
   *         if (!nums.containsKey(i))
   *             nums.put(i, 1);
   *         else {
   *             nums.put(i, nums.get(i) + 1);
   *             if (max < nums.get(i))
   *                 max = nums.get(i);
   *         }
   *     return a.length - max;
   *
   */
  static int equalizeArray(int[] arr) {
int length =arr.length;
    Map<Integer, Integer> frequencies =
        Arrays.stream(arr).boxed()
        .collect(toMap(identity(), v -> 1, Integer::sum));

    List<Integer> maxls= Collections.singletonList(frequencies.entrySet().stream()
        .max(Map.Entry.comparingByValue())
        .get()
        .getKey());

  int max =  maxls.stream().findFirst().get();
  int total= (int) Arrays.stream(arr).filter(x->x==max).count();

  return length-total;
  }


  public static void main(String[] args) {
int arr[] = {2 ,2, 3, 2, 2, 3 ,3, 3,1};
    System.out.println(equalizeArray(arr));
  }
}
