package HackerRankJava.StaticInitializer;

import ReflectionAPI.TetrisExample.WithReflection.H;

import java.util.Scanner;

public class Solution{
  public static int B;
  public static int H;
  public static boolean flag;
  static {
    Scanner s = new Scanner(System.in);
    flag=true;
    B=s.nextInt();
    H=s.nextInt();

    try {
      if(H<0 || B<0)
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    } catch (Exception e) {
      e.printStackTrace();
      flag=false;
    }

  }

  public static void main(String[] args)  {
    if(flag){

      int area=B*H;
      System.out.print(area);
    }

  }//end of main

}//end of class

