package HackerRankJava.SequenceEquation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
  static int[] permutationEquation(int[] p) {
    List<Integer> al= Arrays.stream(p).boxed().collect(Collectors.toList());

    int temp[]=new int[p.length];

    for (int i =1; i<p.length+1 ; i++){
    int first=  al.indexOf(i)+1;
    int second= al.indexOf(first)+1;

    temp[i-1]=second;
    }
  return temp;
  }

  public static void main(String[] args) {
    int[] p= {5,2,1,3,4};
    System.out.println(permutationEquation(p));
  }
}
