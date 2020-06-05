package HackerRank.OrganizingContainersOfBalls;

import java.util.ArrayList;

public class Solution {
  static String organizingContainers(int[][] container) {


    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int m = 0; m < container.length; m++) {
      int sum = 0;
      for (int[] ints : container) {
        sum += ints[m];
      }
      arrayList.add(sum);


    }


    for (int j = 0; j < container.length; j++) {

      int oneContainer = 0;
      for (int i = 0; i < container[0].length; i++) {
        oneContainer += container[j][i];
      }

      if (arrayList.contains(oneContainer)) {
        arrayList.remove(arrayList.indexOf(oneContainer));
      } else return "Impossible";
    }

    return "Possible";
  }

  public static void main(String[] args) {
    int arr[][] = {{0, 2}, {1, 1}};

    System.out.println(organizingContainers(arr));


  }
}
