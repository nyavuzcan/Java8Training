package HackerRankJava.JavaOneDArray;

public class Solution {
  public static boolean canWin(int leap, int[] game,int i) {
    if (i < 0 || game[i] == 1)
      return false;
    if (i + 1 >= game.length || i + leap >= game.length)
      return true;

    game[i] = 1; //flag

    return canWin(leap, game, i + leap)
        || canWin(leap, game, i + 1)
        || canWin(leap, game, i - 1);
  }

  public static void main(String[] args) {

    int [] arr ={0 ,0, 0, 0, 0, 1, 0, 1, 0};
    int leap =41;

    System.out.println((canWin(leap, arr, 0)) ? "YES" : "NO");
  }

}
