package HackerRank.BreakTheRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class tmain {
  static int[] breakingRecords(int[] scores) {

    List<Integer> scoreList=
        Arrays.stream(scores).boxed().collect(Collectors.toList());
    ArrayList<Integer> maxScoreList= new ArrayList<>();
    ArrayList<Integer> minScoreList= new ArrayList<>();
    Integer max = 0;
    Integer low = 1000000000;
   for (Integer score: scoreList){
     if (max<score)
       max=score;
     if (low>score)
       low=score;
    maxScoreList.add(max);
     minScoreList.add(low);

   }
    List<Integer> scoreLast =new ArrayList<>();
    List<Integer> scoreLastMin =new ArrayList<>();

    for (int i = 0 ;i<scoreList.size()-1; i++){
      if (maxScoreList.get(i+1)>maxScoreList.get(i))
        scoreLast.add(i+1);
   }
    for (int i = 0 ;i<scoreList.size()-1; i++){
      if (minScoreList.get(i+1)<minScoreList.get(i))
        scoreLastMin.add(i+1);
   }

    //scoreLast.stream().mapToInt(i -> i).toArray();
    int[] arr= {scoreLast.size(),scoreLastMin.size()};
    return arr;
  }
  public static void main(String[] args) {
    int[] scores ={100000000, 100000000 ,10000000 ,10000000 ,1000000};
    breakingRecords(scores);
  }
}
