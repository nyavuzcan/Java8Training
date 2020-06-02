package HackerRank.AcmIcocTeam;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.BitSet;
/*

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s = in.readLine();
            String[] parts = s.split(" ");
            int n = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            BitSet[] ppl = new BitSet[n];
            int num = 0;
            while ((s = in.readLine()) != null/* && s.length() != 0){
            ppl[num] = new BitSet(m);
            for (int i = 0; i < s.length(); i++){
    if (Character.getNumericValue(s.charAt(i)) == 1){
    ppl[num].set(i);
    }
    }
    num++;
    }
    int maxTeams = 0;
    int maxTops = 0;
    for (int i = 0; i < n; i++){
    for (int j = (i+1); j < n; j++){
    int tops = 0;
    for (int k = 0; k < m; k++){
    if (ppl[i].get(k) | ppl[j].get(k)){
    tops++;
    }
    }
    if (maxTops < tops){
    maxTeams = 1;
    maxTops = tops;
    } else if (maxTops == tops){
    maxTeams++;
    }
    }
    }
    System.out.println(maxTops);
    System.out.println(maxTeams);
    }
    }

 */
public class Solution {
BitSet [] bitSets = new BitSet[10];
  static int[] acmTeam(String[] topic) {
  int size=   topic.length;
  int combination =     (size*(size-1))/2;
  int[] arr= new int[2];
  int [] arrx=new int[combination];

  int max=0;
  int count =0;
  for (int i =0; i<size-1  ; i++){
    String a= topic[i];
      for (int j= i+1 ; j<size ; j++){
       String b = topic[j];

        BigInteger b1 = new BigInteger(a,2);
        BigInteger b2 = new BigInteger(b,2);

       int temp = (int) Arrays.stream(b1.or(b2).toString(2).split(""))
            .filter(x->x.equals("1")).count();
  if (temp>max)
      max=temp;
        arrx[count]=temp;
        count++;
      }
  }

  arr[0]= max;

    int finalMax = max;
   int aa =(int)Arrays.stream(arrx).filter(x->x== finalMax).count();
    arr[1]=aa;
    return arr;
  }

  /**
   * 10101
   * 11100
   * 11010
   * 00101
   *
   * 5
   * 2
   *
   * @param args
   */



  public static void main(String[] args) {
      String arr [] =new String[4];
      arr[0]="10101";
      arr[1]="11100";
      arr[2]="11010";
      arr[3]="00101";

    Arrays.stream(acmTeam(arr)).forEach(System.out::println);
    }
}
