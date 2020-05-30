package HackerRank.JumpingOnClouds;

public class Solution {
  static int jumpingOnClouds(int[] c) {

    int count =0;
    int i=0;
   while (i!=c.length){

      if (i+2<=c.length-1 && c[i+2]==0){
        count++;
        i+=2;
        continue;
      }else if (i+1<=c.length-1 &&   c[i+1]==0){
        i+=1;
        count++;
        continue;
      } break;

    }

    return count;
  }

  public static void main(String[] args) {
    int arr[]={0, 0, 1, 0, 0, 0, 0, 1, 0, 0};
    System.out.println(jumpingOnClouds(arr));
  }

}
