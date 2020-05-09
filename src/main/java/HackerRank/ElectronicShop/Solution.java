package HackerRank.ElectronicShop;

public class Solution {

  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int max=0;
    for (int i =0; i < keyboards.length; i++){
      for (int j=0;j< drives.length ; j++){
        int cost =keyboards[i]+drives[j];
        if (cost>b) continue;
        if (cost==b){
          return b;
        }
        else {
          if (max<cost) max=cost;
        }
      }
    }
    if (max==0) return -1;
    return max;

  }

  public static void main(String[] args) {
    int ar[]={5};
    int arr[]={4};
    int b=5;
    System.out.println(getMoneySpent(ar,arr,b));
  }
}
