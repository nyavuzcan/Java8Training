package HackerRank.CountingValleys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Solutions {
  static int countingValleys(int n, String s) {
  String[] ar= s.split("");
 List<String> uAndD =new ArrayList<>();
 for (int i =0;i<ar.length;i++){
   uAndD.add(ar[i]);
 }

int step=0;
int pastStep=0;
int valley=0;
for (String x : uAndD){
   int num;
   if (x.equals("D")) num=-1;
  else num=1;
    step+=num;
     if (pastStep<0 && step==0)
       valley++;
     pastStep+=num;
}


return valley;

  }

  public static void main(String[] args) {
    System.out.println(countingValleys(8,"DDUUDDUDUUUD"));
  }

}
