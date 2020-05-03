package HackerRank.BolunebilirCiftlerList;

import java.util.*;
import java.util.stream.Collectors;
class Pair{
  private Integer x;
  private Integer y;

  public Pair(Integer x, Integer y) {
    this.x = x;
    this.y = y;
  }

  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }
}

public class testMain {
  static int divisibleSumPairs(int n, int k, int[] ar) {

    List<Integer> listArr = Arrays.stream(ar).boxed().collect(Collectors.toList());
   int count=0;
    for (int i =0; i<listArr.size()-1; i++){
      for (int j=i+1;j<listArr.size();j++){
        if ((listArr.get(i)+listArr.get(j))%k==0)
          count++;
      }

    }

return count;
  }

  public static void main(String[] args) {
    int arr[] = {1,3,2,6,1,2};
    System.out.println(divisibleSumPairs(6,3,arr));

  }

}
