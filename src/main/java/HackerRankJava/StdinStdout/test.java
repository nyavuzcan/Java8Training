package HackerRankJava.StdinStdout;

import java.util.Scanner;

public class test {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String myString = scanner.next();
    int myInt=scanner.nextInt();
    int myIntS=scanner.nextInt();
    int myIntTh=scanner.nextInt();
    scanner.close();

    System.out.println(myInt);
    System.out.println(myIntS);
    System.out.println(myIntTh);
  }
}
