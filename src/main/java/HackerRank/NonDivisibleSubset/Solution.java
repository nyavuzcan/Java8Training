package HackerRank.NonDivisibleSubset;

import java.util.Arrays;
import java.util.List;

class Result {

  /*
   * Complete the 'nonDivisibleSubset' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY s
   */


  static int nonDivisibleSubset(int k, List<Integer> arr) {
    int[] remains=new int[k];
    for (int i=0;i<arr.size();i++){
      remains[arr.get(i)%k]++;
    }
    int result=0;
    if (remains[0]>0){
      result++;
    }
    for (int i=1;i<remains.length;i++){
      if(i==(k-i)){
        result++;
      }else {
        if (remains[i]>=remains[k-i]){
          result+=remains[i];
        }else {
          result+=remains[k-i];
        }
        remains[i]=0;
        remains[k-i]=0;
      }
    }
    return result;
  }

}
public class Solution {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(1,7,2,4);
    Result.nonDivisibleSubset(3,integers);
  }
}
