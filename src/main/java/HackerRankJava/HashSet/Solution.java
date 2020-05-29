package HackerRankJava.HashSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   int a = sc.nextInt();


    Set<String> strings = new HashSet<>();

    for (int i =0 ;i<a ; i++){
      String s=sc.nextLine();
      strings.add(s);
      System.out.println(strings.size());
    }

  }
}
