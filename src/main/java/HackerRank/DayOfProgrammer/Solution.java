package HackerRank.DayOfProgrammer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Solution {
  static String dayOfProgrammer(int year) {
    if(year==1918)
    {
      return "26.09." + year;
    }
    else if(year>=1919)
    {
      if(year%400==0 || (year%4==0 && year%100!=0))
      {
        return "12.09." + year;
      }
      else
      {
        return "13.09." + year;
      }
    }
    else if(year<=1917)
    {
      if(year%4==0)
      {
        return "12.09." + year;
      }
      else
      {
        return "13.09." + year;
      }
    }
return null;
  }

  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2400));
  }
}
