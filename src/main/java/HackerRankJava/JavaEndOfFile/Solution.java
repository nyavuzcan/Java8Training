package HackerRankJava.JavaEndOfFile;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i =1;
    while (scanner.hasNext()){

      String s =scanner.nextLine();
      System.out.println(i+" "+s);
      i++;
    }


  }

}
