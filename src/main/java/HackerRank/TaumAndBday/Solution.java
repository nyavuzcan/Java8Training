package HackerRank.TaumAndBday;

import java.math.BigInteger;

public class Solution {

  public static long taumBday(int b, int w, int bc, int wc, int z) {
    long cost =0;
    long costx =0;
   if (bc>((wc+z))){
      cost+=b*(wc+z);
    }else cost+=(long)b*(long)bc;
/**
 * INT * INT OTOMATİK OLARAK LONG CAST EDİLİYOR!!!!!
 */
    if (wc>((bc+z)))
      cost+=w*(bc+z);
    else cost+=w*wc;




    long minBlackPrice = Math.min(bc, wc + z);

    //Calculate black->white and choose max between it and white
    long minWhitePrice = Math.min(wc, bc + z);

    //Multiple the price for each one by the number of gifts we need
  costx+=(minBlackPrice * b) + (minWhitePrice * b);
    return costx;
  }



  public static void main(String[] args) {
    System.out.println(taumBday(443463982 ,833847400,429734889 ,628664883 ,610875522));
  }
}
