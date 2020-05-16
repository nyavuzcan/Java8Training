package HackerRankJava.DuplicateWords;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {

  public static void main(String[] args) {
  /*  String a ="Goodbye bye bye world world world";
   a= a.toUpperCase();
    String []arr = a.split(" ");

    Set<String> setSr= Arrays.stream(arr).collect(Collectors.toSet());

    System.out.println(setSr);

  }*/


    String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
      String input = in.nextLine();

      Matcher m = p.matcher(input);

      // Check for subsequences of input that match the compiled pattern
      while (m.find()) {
        input = input.replaceAll(m.group(), m.group(1));
      }

      // Prints the modified sentence.
      System.out.println(input);
    }

    in.close();
  }
}
