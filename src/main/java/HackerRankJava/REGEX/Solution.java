package HackerRankJava.REGEX;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
      String IP = in.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }

  }


}

class MyRegex{
  private static final String zeroTo255
      = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

  private static final String IP_REGEXP
      = zeroTo255 + "\\." + zeroTo255 + "\\."
      + zeroTo255 + "\\." + zeroTo255;

  String pattern;
  public MyRegex() {
    pattern=IP_REGEXP;

  }



}