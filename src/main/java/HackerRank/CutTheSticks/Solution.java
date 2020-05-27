package HackerRank.CutTheSticks;

import ReflectionAPI.TetrisExample.WithReflection.I;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  static int[] cutTheSticks(int[] arr) {
    List<Integer> integers =new ArrayList<>();
    while (arr.length!=0){
     integers.add(arr.length);
    int minValue= Arrays.stream(arr).min().getAsInt();
   arr= Arrays.stream(arr).map(x->x=x-minValue).filter(x->x>0).toArray();
   }
  return integers.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int arr[] ={1 ,2 ,3 ,4 ,3 ,3 ,2 ,1};
    System.out.println(cutTheSticks(cutTheSticks(arr)));
  }
}
