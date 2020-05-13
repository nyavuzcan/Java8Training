package HackerRank.HurdleRace;

import java.util.Arrays;
import java.util.Comparator;

public class solution {

  public static void main(String[] args) {
    int[] height={2,3,45};
    int x=  Arrays.stream(height).max().getAsInt();
    System.out.println(x);
  }
}
