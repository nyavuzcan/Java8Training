package HackerRank.ServiceLane;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  static int[] serviceLane(int n, int[][] cases) {
    List<Integer> yollist= new ArrayList<>();
    List<Integer> rt = new ArrayList<>();

    for (int i=0 ;i<n ; i++){
      yollist.add(cases[0][i]);
    }

    for (int i=1;  i<cases.length;i++){

     int x= cases[i][0];
     int y = cases[i][1];

  int z=   yollist.subList(x,y).stream().min(Integer::compareTo).get();
    rt.add(z);
    }

    int[] rtx = new int[rt.size()];
    for (int i =0;i<rt.size() ; i++)
      rtx[i]=rt.get(i);
  return rtx;
  }

  public static void main(String[] args) {


  }
}
