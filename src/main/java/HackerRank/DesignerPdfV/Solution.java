package HackerRank.DesignerPdfV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public static void main(String[] args) {
    char[] charArr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    int [] intArr={1 ,3 ,1 ,3 ,1 ,4, 1 ,3 ,2 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,5 ,7};
    Arrays.stream(intArr).max().getAsInt();
    String a ="abc";
    String [] parse=a.split("");

    int max=0;
    for (int j=0; j<parse.length ; j++){
    for (int i = 0; i<charArr.length; i++){
      if (parse[j].charAt(0)==charArr[i]){
        if (max<intArr[i])
          max=intArr[i];
        break;
      }
    }
   // return parse.length * max;


  }
  }
}
