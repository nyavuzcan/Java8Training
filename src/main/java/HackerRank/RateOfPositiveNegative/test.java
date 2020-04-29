package HackerRank.RateOfPositiveNegative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test {
  static void plusMinus(int[] arr) {
    double positive=0;
    double negative=0;
    double zeros=0;
    int pCount =0;
        int nCount =0;
        int zCount = 0;

    List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());

    for(Integer x : arrList){
      if(x>0){
        pCount++;
        continue;
      }
      else if(x<0){
        nCount++;
        continue;
      }
      else if(x==0){
        zCount++;
        continue;
      }
    }
    Double sizeOfList= Double.valueOf(arrList.size());

    positive = pCount/sizeOfList;

    negative = nCount/sizeOfList;

    zeros = zCount/sizeOfList;

    System.out.println(" "+positive+" "+ negative+ " "+zeros);
  }

  public static void main(String[] args) {
    int[] arr ={-4,3,-9,0,4,1};
    plusMinus(arr);
  }
}
