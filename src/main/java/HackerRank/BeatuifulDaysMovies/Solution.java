package HackerRank.BeatuifulDaysMovies;

public class Solution {
  static int beautifulDays(int i, int j, int k) {
    int count =0;
    for (;i<=j;i++){
      int reverse = findReverse(i);
      if (Math.abs(i-reverse)%k==0) count++;
    }

return count;

  }


  public static void main(String[] args) {
    System.out.println(beautifulDays(20,23,6));
  }





  //find reverse number
  public static int findReverse(int number){
    int num = number, reversed = 0;

    while(num != 0) {
      int digit = num % 10;
      reversed = reversed * 10 + digit;
      num /= 10;
    }
    return reversed;
  }
}
