package HackerRankJava.SubArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solutions {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    int[] arr =new int[t];
    for (int i=0; i<t; i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for (int i=0;i<arr.length; i++){
      for (int j=i;j<arr.length ; j++){
        int sum =0;
        for (int z=i;z<j+1 ; z++){
          sum+=arr[z];
        }
        if (sum<0) count++;
      }
    }
    System.out.println(count);
  }
}
