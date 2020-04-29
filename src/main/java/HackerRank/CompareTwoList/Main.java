package HackerRank.CompareTwoList;

import java.util.ArrayList;
import java.util.List;

public class Main {

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int bob=0;
    int alice=0;
    int count = 0;
    for(Integer a1 : a){

      if(a1==b.get(count)){
        count++;
        continue;
      }else if(a1>b.get(count)){
        count++;
        alice++;
        continue;
      }else if(a1<b.get(count)){
        count++;
        bob++;
        continue;
      }
    }
    List<Integer> rt = new ArrayList();
    rt.add(alice);
    rt.add(bob);
    return rt;
  }



  public static void main(String[] args) {
    List<Integer> aliceList = new ArrayList<>();
    List<Integer> bobbList = new ArrayList<>();
    aliceList.add(5);
    aliceList.add(6);
    aliceList.add(7);

    bobbList.add(3);
    bobbList.add(6);
    bobbList.add(10);

    compareTriplets(aliceList,bobbList);
  }
}
