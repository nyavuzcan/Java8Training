package HackerRank.BonAppetit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
  static void bonAppetit(List<Integer> bill, int k, int b) {
    ArrayList<Integer> lx = new ArrayList<>();
    lx.addAll(bill);
    lx.remove(k);
   int sumEach = (lx.stream().collect(Collectors.summingInt(Integer::intValue)))/2;

   if (sumEach==b)
     System.out.println("Bon Appetit");
   else System.out.println(b-sumEach);

  }

  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(3,10,2,9);
    bonAppetit(ls,1,7);
  }
}
