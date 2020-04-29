package HackerRank.AppleAndOrangeDistance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {
  static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    List<Integer> appleList = Arrays.stream(apples).boxed().collect(Collectors.toList());
    List<Integer> orangeList = Arrays.stream(oranges).boxed().collect(Collectors.toList());
    int appleCount=0;
    int orangeCount=0;
    for (Integer apple : appleList){
      if (a+apple>=s && a+apple<=t)
        appleCount++;
    }
    for (Integer orange : orangeList){
      if (b+orange>=s && b+orange<=t)
        orangeCount++;
    }
    System.out.println(appleCount);
    System.out.println(orangeCount);

  }

  public static void main(String[] args) {
   // countApplesAndOranges(7,11,5,15, 3,2);
  }
}
