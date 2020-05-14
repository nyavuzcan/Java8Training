package HackerRankAkbank.Quesiton1;

import java.util.*;

public class Solution {
  public static void main(String[] args) {

    List<Integer> scores = Arrays.asList(100,100,50,80,100);
    int k = 0;
    scores.sort(Comparator.reverseOrder());
    SortedMap<Integer,Integer> sortedMap =new TreeMap<>(Comparator.reverseOrder());
    int count =1;
    for (int i=0; i<scores.size() ; i++){

      if (sortedMap.get(scores.get(i))==null){
        sortedMap.put(scores.get(i),count);


      }
      count++;
    }
      List<Integer> finalList= new ArrayList<>();
    for (int i =0; i<scores.size() ; i++){
      if (scores.get(i)==0) continue;
    if (sortedMap.get(scores.get(i))<=k)
        finalList.add(scores.get(i));
    }
    System.out.println(finalList.size());

    }


  }



