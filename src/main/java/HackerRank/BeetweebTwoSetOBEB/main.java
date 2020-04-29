package HackerRank.BeetweebTwoSetOBEB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

  public static int getTotalX(List<Integer> a, List<Integer> b) {
    int count=0;
    a.sort(Integer::compareTo);
    b.sort(Integer::compareTo);
    ArrayList<Integer> templist =new ArrayList<>();

    for (int i = a.get(a.size()-1); i<=b.get(0) ; i++ ){
      if (count(a,i)){
        templist.add(i);
      }
    }
    List<Integer>last = new ArrayList<>();
    for (Integer tempf: templist){
      if (reCount(tempf,b)){
        last.add(tempf);
      }
    }

return last.size();
  }
public static boolean reCount(int number, List<Integer>li){
    for (Integer a : li){
      if (a%number!=0){
        return false;
      }
    }
    return true;
}
  public static boolean count(List<Integer> li,int number){
    int temp =0;
    for (Integer x : li){
      if (number%x==0){
        temp++;
      }
    }
    if (temp==li.size())
      return true;
    return false;
  }

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(2,4);
    List<Integer> b = Arrays.asList(16,32,96);

    System.out.println(getTotalX(a,b));

  }
}
