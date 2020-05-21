package HackerRank.JumpingonTheClouds;

public class Solutions {

  static int jumpimgOnClouds(int[] c ,int k){
    int n=c.length;
    int energy = 100;
    int cloud = 0;
    do
    {
      energy--; //You performed a jump

      cloud = (cloud + k) % n;

      if(c[cloud] == 1)
      {
        energy -= 2;//You landed on a thundercloud
      }
    }
    while(cloud != 0);
    return energy;
  }

  public static void main(String[] args) {
    // int c[]={0,0,1,0,0,1,1,0};
      int c[]={0 ,0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1};


    System.out.println(jumpimgOnClouds(c,2));

  }
}
