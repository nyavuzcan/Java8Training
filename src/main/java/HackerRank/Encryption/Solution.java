package HackerRank.Encryption;

import java.util.Objects;

public class Solution {
  static String encryption(String s) {

    String[] arr = s.replaceAll("\\s", "").split("");
    int x = (int) Math.sqrt(arr.length);
    String[][] arrNew;
    if (x * (x + 1) < arr.length) {
      arrNew = new String[x+1][x + 1];

    } else {
      arrNew = new String[x][x + 1];
    }


    int count = 0;
    for (int i = 0; i < arrNew.length; i++) {
      for (int j = 0; j < arrNew[0].length; j++) {
        if (Objects.nonNull(arr[count])) {
          arrNew[i][j] = arr[count];
          count++;
          if (count == arr.length) break;
        } else break;
      }
    }

    String newS = "";
    int say = 0;
    for (int i = 0; i < arrNew[0].length; i++) {
      for (int j = 0; j < arrNew.length; j++) {
        if (Objects.nonNull(arrNew[j][i])) {
          newS += arrNew[j][i];

        } else {

          if (say == arr.length) break;
          continue;
        }
      }
      newS += " ";
    }

    return newS;
  }

  public static void main(String[] args) {
    System.out.println(encryption("wclwfoznbmyycxvaxagjhtexdkwjqhlojykopldsxesbbnezqmixfpujbssrbfhlgubvfhpfliimvmnny"));
  }
}
