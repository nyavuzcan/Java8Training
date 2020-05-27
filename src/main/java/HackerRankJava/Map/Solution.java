package HackerRankJava.Map;

import java.util.*;
import java.io.*;

class Solution{
  public static void main(String []argh)
  {
    Map<String,Integer> stringIntegerMap = new HashMap<>();
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++)
    {
      String name=in.nextLine();
      int phone=in.nextInt();
      stringIntegerMap.put(name,phone);
      in.nextLine();
    }
    while(in.hasNext())
    {
      String s=in.nextLine();
      if (Objects.nonNull(stringIntegerMap.get(s)))
        System.out.println(s+"="+stringIntegerMap.get(s));
      else System.out.println("Not found");
    }
  }
}
