package HackerRankJava.JavaStrings;

public class Solution {

  public static void main(String[] args) {
    String A = "hello";
    A = A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase();
    String B = "java";
    B = B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase();
    System.out.println(A.length()+B.length());
    if ((int)A.substring(0,1).toUpperCase().charAt(0)>(int)B.substring(0,1).toUpperCase().charAt(0))
      System.out.println("Yes");
    else System.out.println("No");

    System.out.println(A+" "+B);

  }
}
