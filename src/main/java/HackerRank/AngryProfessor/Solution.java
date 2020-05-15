package HackerRank.AngryProfessor;

import java.util.Arrays;

public class Solution {
  static String angryProfessor(int k, int[] a) {

    int count=a.length- (int) Arrays.stream(a).filter(x->x>0).count() ;
    if (count<k) return "YES";
    return "NO";

  }

  public static void main(String[] args) {

  }
}
