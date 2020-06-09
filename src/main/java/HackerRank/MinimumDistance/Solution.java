package HackerRank.MinimumDistance;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Solution {
  static int minimumDistances(int[] a) {
 Map<Integer, Integer> arrMap= Arrays.stream(a).boxed()
        .collect(toMap(identity(), v -> 1, Integer::sum));


    List<Integer> lis= Arrays.stream(a).boxed().collect(toList());
    ArrayList<Integer> ic=new ArrayList<>();
    for (Map.Entry me : arrMap.entrySet()) {
    if ((int)me.getValue()==2){
     int x = lis.indexOf(me.getKey());
      int y= lis.lastIndexOf(me.getKey());
     int z= y-x;
     ic.add(z);
    }
    }
    if (ic.isEmpty()) return -1;

    return ic.stream().min(Integer::compareTo).get();
  }

  public static void main(String[] args) {
    int a[] = {1 ,2, 3, 4, 10};

    System.out.println(minimumDistances(a));
  }

}
