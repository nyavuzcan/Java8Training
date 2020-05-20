package HackerRank.CircularArrayRotation;

public class Solution {
  static int[] circularArrayRotation(int[] a, int k, int[] queries) {
/**
 * BEST CODE
 *  k = k % a.length;
 *     int[] result = new int[queries.length];
 *     for (int i = 0; i < result.length; i++) {
 *       result[i] = a[(queries[i] - k + a.length) % a.length];
 *     }
 *
 *     return result;
 */
    for(int i = 0; i < k; i++){
      int j, last;
      //Stores the last element of array
      last = a[a.length-1];

      for(j = a.length-1; j > 0; j--){
        //Shift element of array by one
        a[j] = a[j-1];
      }
      //Last element of array will be added to the start of array.
      a[0] = last;
    }

    int rt[] =new int[queries.length];
    for (int z =0; z<rt.length; z++){
      rt[z]= a[queries[z]];
    }
    return rt;
  }

  public static void main(String[] args) {
    int a[]={3,4,5,1};
    int k = 2;
    int m[] ={1,2};
    System.out.println(circularArrayRotation(a,k,m));
  }
}
