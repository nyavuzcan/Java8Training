package HackerRankJava.ViralAdvertising;

public class Solution {
  public static void main(String[] args) {
    int sum=0;
    int n= 3;
    int startCount = 5;
    for (int x = 0; x<n ; x++){
        int key = startCount/2;
        sum+=key;
         startCount=key*3;
    }

    System.out.println(sum);
  }
}
