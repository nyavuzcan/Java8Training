package HackerRankJava.SplitAndSortString;



public class Solution {
  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    int count=k;
    java.util.List<String> ls = new java.util.ArrayList<>();
    for (int i = 0 ; i<s.length()-k+1; i++) {
      ls.add(s.substring(i, i+k));
      count+=k;


    }
    ls.sort(String::compareTo);
    smallest=ls.get(0);
    largest=ls.get(ls.size()-1);
    return smallest + "\n" + largest;}
  public static void main(String[] args) {
    System.out.println(getSmallestAndLargest("welcometojava",3));
  }
}
