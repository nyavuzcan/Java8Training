package SadiEvren;

import sun.font.CreatedFontTracker;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

  /*
   * Complete the 'minimizeBias' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER_ARRAY ratings as parameter.
   */

  public static int fewestCoins(String coins) {
    String[] trimmedArray = coins.split("");

    System.out.println(trimmedArray[0]);

    Set<String> hash_Set = new HashSet<String>();
    for (String x:trimmedArray){
      hash_Set.add(x);
    }

    for (String z: trimmedArray){

    }
    return 0;
    /*Integer totalNeed = 0;
    for (int i =0 ; i<total.size() ; i++){
      totalNeed+=used.get(i);
    }

      Collections.sort(total);
      Collections.reverse(total);

      int returnCount=0;
      int totalCatch=0;
      for (int z =0; z<used.size();z++){
        if ((totalNeed >totalCatch)){
          totalCatch+=total.get(z);
          returnCount++;
        }
      }

    return returnCount;

*/
  //  HashMap<String,Integer> hashMap = new HashMap();
    // Write your code here

  /*  for(int i =0 ; i<ratings.size()-1;i++){
      for ( int j=i+1;j<ratings.size();j++){
        hashMap.put(ratings.get(i)+" "+ratings.get(j),Math.abs(ratings.get(i)-ratings.get(j)));
      }

    }
    Integer minValue = null;
    Integer minValueCount = 0;

    for (String key : hashMap.keySet()){
      System.out.println(key+" "+ hashMap.get(key));
      if(minValue==null) minValue=hashMap.get(key);
      if(minValue>hashMap.get(key)){
        minValue=hashMap.get(key);
      }else if(minValue==hashMap.get(key)) minValueCount++;
      }
    System.out.println("MİNVA:"+minValueCount);
    return minValueCount;*/

  }


}

public class Solution {
  protected int test=0;
  //default olsaydı diğer paketten erişemeyecekti
  //protected oldugu için kalıtım varsa erişebiliyoruz
  public static void main(String[] args) throws IOException {
    List<Integer>used = new ArrayList<>();
    List<Integer>total = new ArrayList<>();
    used.add(3);
    used.add(2);
    used.add(1);
    used.add(3);
    used.add(1);

    total.add(3);
    total.add(4);
    total.add(3);
    total.add(5);
    total.add(5);

    Result.fewestCoins("nevzat");

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int usedCount = Integer.parseInt(bufferedReader.readLine().trim());

   // List<Integer> used = new ArrayList<>();

    for (int i = 0; i < usedCount; i++) {
      int usedItem = Integer.parseInt(bufferedReader.readLine().trim());
      used.add(usedItem);
    }

    int totalCount = Integer.parseInt(bufferedReader.readLine().trim());

//    List<Integer> total = new ArrayList<>();

    for (int i = 0; i < totalCount; i++) {
      int totalItem = Integer.parseInt(bufferedReader.readLine().trim());
      total.add(totalItem);
    }

   /* //int result = Result.minCans(used, total);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
*/

  }

}
