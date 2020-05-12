package HackerRank.ClimbingtheLeaderBoard;

import ReflectionAPI.TetrisExample.WithReflection.I;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solutiın {
  public static int findClosest(int arr[], int target)
  {
    int n = arr.length;

    // Corner cases
    if (target <= arr[0])
      return arr[0];
    if (target >= arr[n - 1])
      return arr[n - 1];

    // Doing binary search
    int i = 0, j = n, mid = 0;
    while (i < j) {
      mid = (i + j) / 2;

      if (arr[mid] == target)
        return arr[mid];

            /* If target is less than array element,
               then search in left */
      if (target < arr[mid]) {

        // If target is greater than previous
        // to mid, return closest of two
        if (mid > 0 && target > arr[mid - 1])
          return getClosest(arr[mid - 1],
              arr[mid], target);

        /* Repeat for left half */
        j = mid;
      }

      // If target is greater than mid
      else {
        if (mid < n-1 && target < arr[mid + 1])
          return getClosest(arr[mid],
              arr[mid + 1], target);
        i = mid + 1; // update i
      }
    }

    // Only single element left after search
    return arr[mid];
  }

  // Method to compare which one is the more close
  // We find the closest by taking the difference
  //  between the target and both values. It assumes
  // that val2 is greater than val1 and target lies
  // between these two.
  public static int getClosest(int val1, int val2,
                               int target)
  {
    if (target - val1 >= val2 - target)
      return val2;
    else
      return val1;
  }

  public static void main(String[] args) {

    int[] scores={100,90,90,80,75,60};
    int[] alice={50,65,77,90,102};
    int arf[]=new int[alice.length];

    //SortedMap<Integer,Integer> set =new TreeMap<>(Collections.reverseOrder());
    SortedMap<Integer,Integer> sortedMap =new TreeMap<>();
    int count =1;
    for (int i=0; i<scores.length ; i++)
      if (sortedMap.get(scores[i])==null){
        sortedMap.put(scores[i],count++);
      }
    for (int i=0; i<alice.length; i++){
      if (Objects.nonNull(sortedMap.get(alice[i])))
        arf[i]=sortedMap.get(alice[i]);
      else {
     int x =findClosest(sortedMap.keySet().stream().mapToInt(Integer::intValue).toArray(),
         alice[i]);
     if (x<alice[i]) arf[i]=sortedMap.get(x);
     else arf[i] =sortedMap.get(x)+1;


      }

    }





      }
}
