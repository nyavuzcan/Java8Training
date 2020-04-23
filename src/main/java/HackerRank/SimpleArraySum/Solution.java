package HackerRank.SimpleArraySum;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
*int[] array Integer'a dönüştürüldü
 * stream ile mapToInt ile toplandı
 *
 *
**/
public class Solution {

  /*
   * Complete the simpleArraySum function below.
   */
  static int simpleArraySum(int[] ar) {
    List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
    return list.stream().mapToInt(Integer::intValue).sum();


  }


  public static void main(String[] args) throws IOException {
    int ar[]={1,2,4,45,6,7,7};
    System.out.println(simpleArraySum(ar));
  }
}