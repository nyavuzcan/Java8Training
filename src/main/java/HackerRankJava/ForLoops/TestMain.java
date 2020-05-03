package HackerRankJava.ForLoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {


  public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();

    for(int i=0;i<t;i++){
    int  a = in.nextInt();
     int b = in.nextInt();
     int n = in.nextInt();
      int sum=0;
      List<Integer> result = new ArrayList<>();
      sum+= a+(Math.pow(2,0))*b;
      result.add(sum);
      for (int z =1; z<n;z++ ){
        sum+=((Math.pow(2,z))*b);
        result.add(sum);
      }
      String st="";
      for (Integer xs : result){
        st+=String.valueOf(xs)+" ";
      }
      System.out.println(st);
      st="";

      sum=0;
      result = new ArrayList<>();


    }
    in.close();

  }
}
