package HackerRankJava.StringTokens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /* Read input */
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();

    s = removeLeadingNonLetters(s);

    /* Check special cases */
    if (s.length() == 0) {
      System.out.println(0);
      return;
    }

    /* Split on all non-alphabetic characters */
    String[] words = s.split("[^a-zA-Z]+");

    /* Print output */
    System.out.println(words.length);
    for (String word : words) {
      System.out.println(word);
    }
  }

  private static String removeLeadingNonLetters(String str) {
    int i;
    for (i = 0; i < str.length(); i++) {
      if (Character.isLetter(str.charAt(i))) {
        break;
      }
    }
    return str.substring(i);
  }
}
