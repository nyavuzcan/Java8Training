package HackerRankJava.reverseString;

public class solution {

  public static void main(String[] args) {
    String av=new String("nevzat");
    String ab="nevzat";
  if (av.equals(ab)) System.out.println("esit");
    String s = "ata";
    String[] arr = s.split("");
    int count =0;
    for (int i = 0; i < s.length(); i++){
     if (arr[i].equals(arr[s.length()-1-i])){
       count++;
     }
    }

    if (count==s.length())
      System.out.println("Yes");
    else System.out.println("No");
  }
}
