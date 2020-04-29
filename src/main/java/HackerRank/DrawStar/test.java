package HackerRank.DrawStar;

public class test {
  static void staircase(int n) {

  for (int i =1 ; i<n+1 ; i++){
    String write="";
    int tempN=n-i;
    for (int z =0; z<tempN; tempN--){
      write+=" ";
    }

    for ( int j=0; j<i ; j++ ){


      write+="#";

      }
    System.out.println(write);
    write="";
  }

  }

  public static void main(String[] args) {
    staircase(6);
  }
}
