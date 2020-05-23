package HackerRank.FactorielBigNumbers;

import java.math.BigInteger;

public class Solutions {
  static void extraLongFactorials(int n) {
    BigInteger a = new BigInteger(String.valueOf(n));
    BigInteger temp = new BigInteger("1");
    for (int i =n; i!=1 ;i--){
     temp =temp.multiply(a);
     a=new BigInteger(String.valueOf(i-1));
    }

    System.out.println(temp);

  }

  public static void main(String[] args) {
    extraLongFactorials(25);
  }
}
