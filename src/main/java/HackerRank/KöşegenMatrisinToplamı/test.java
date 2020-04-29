package HackerRank.KöşegenMatrisinToplamı;

import java.util.ArrayList;
import java.util.List;

public class test {
  static int result(List<List<Integer>> ar) {
    int i = 0;
    int left = 0;
    for (List<Integer> ls : ar) {
      left += ls.get(i);
      i++;
    }
    int right = 0;
    int j = ar.size() - 1;
    for (List<Integer> ls : ar) {
      right += ls.get(j);
      j--;
    }
    int sol = left - right;
    return Math.abs(sol);

  }

  public static void main(String[] args) {
    List<List<Integer>> ar = new ArrayList<>();

    List<Integer> first = new ArrayList<>();
    first.add(11);
    first.add(2);
    first.add(4);

    List<Integer> second = new ArrayList<>();
    second.add(4);
    second.add(5);
    second.add(6);

    List<Integer> third = new ArrayList<>();
    third.add(10);
    third.add(8);
    third.add(-12);

    ar.add(first);
    ar.add(second);
    ar.add(third);

    System.out.println(result(ar));

  }

}
