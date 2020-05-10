package HackerRank.CatsAndMouse;

public class Solution {
  static String catAndMouse(int x, int y, int z) {

  int a= Math.abs(x-z);
  int b= Math.abs(y-z);
  if (a==b) return "Mouce C";
  else if (a<b) return "Cat A";
  else return "Cat B";


  }

  public static void main(String[] args) {
    System.out.println( catAndMouse(1,2,3));
  }

}
