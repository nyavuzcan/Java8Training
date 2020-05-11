package HackerRank.ClimbingtheLeaderBoard;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solutiın {
  static int[] climbingLeaderboard(int[] scores, int[] alice) {

return null;
  }

  public static void main(String[] args) {

    int[] scores={100,90,90,80,75,60};
    int[] alice={50,65,77,90,102};
    int arf[]=new int[alice.length];
    Set<Integer> set = Arrays.stream(scores).boxed().collect(Collectors.toSet());
 List<Integer>ls=  set.stream().collect(Collectors.toList());

  Collections.reverse(ls);
  List<Integer> tempL=new ArrayList<>();
    tempL.addAll(ls);
  for (int i =0; i<alice.length ;i++){
    if (ls.contains(alice[i])){
      arf[i]= ls.indexOf(alice[i]);
    }else {
    ls=  ls.parallelStream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    for (int z=0;i<scores.length-1;i++){
      if (scores[z]>alice[i] &&  alice[i]>alice[z+1]){
              arf[i]=z+1;
      }else if (alice[i]>scores[z]) arf[i]=1;
        else if(alice[i]< scores[z+1] )  arf[i]=scores.length;
    }
      Collections.reverse(ls);
    arf[i]=ls.indexOf(alice[i]);
    }

    ls.clear();
    ls.addAll(tempL);
  }







    climbingLeaderboard(scores,alice);
  }
}
