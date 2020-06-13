package HackerRank.ChocolateFeast;

public class Solution {
  static int chocolateFeast(int n, int c, int m) {

    int sumEaten = 0;
    int firstChoclate = n/c;
    int paket=0;
    sumEaten+=firstChoclate;
    paket+=firstChoclate;

    while (!(paket<m)){
int yenipk= paket/m;
      sumEaten+=yenipk;
yenipk+=paket%m;
paket=0;


paket = paket%m;
     paket+=yenipk;

    }

    return sumEaten;
  }

  public static void main(String[] args) {
    System.out.println(chocolateFeast(10,2,5));
  }
}
