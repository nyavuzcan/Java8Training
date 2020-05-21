package HackerRankJava.BigInterSumAndMultiply;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String myString = scanner.next();
    String myString2 = scanner.next();

    BigInteger n1= new BigInteger(myString);
    BigInteger n2= new BigInteger(myString2);

    System.out.println(n1.add(n2));
    System.out.println(n1.multiply(n2));

  }
}
