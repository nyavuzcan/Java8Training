package HackerRank.SherlockAndSquares;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  static int squares(int a, int b) {
   /* List<Integer> integers = new ArrayList<>();
    for (int i =a ; i!=b+1 ; i++){
      integers.add(i);
    }

    return (int) integers.parallelStream().filter(x->Math.sqrt(x)%1==0).count();
*/


    int start = (int) Math.sqrt(a); //Finds our starting squareInteger
    int end = (int) Math.sqrt(b);   //Finds our ending squareInteger

    int squareIntegers = end-start; //Calculates the squareIntegers between them

    squareIntegers += (Math.pow(start,2) >= a) ? 1 : 0; //Checks to make sure we didn't forget one when we floored A

  return squareIntegers;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(squares(3,16));
  }
}
