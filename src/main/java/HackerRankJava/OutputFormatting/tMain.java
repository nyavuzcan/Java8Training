package HackerRankJava.OutputFormatting;


import java.util.*;

public class tMain {
  static String getEmpty(Integer i){
    String s="";
    for (int z =0;z<i;z++){
      s+=" ";
    }
    return s;
  }

 static Comparator c = new Comparator<String>()
  {
    public int compare(String s1, String s2) {
      return Integer.compare(s1.length(), s2.length());
    }
  };

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("================================");

      String s1=sc.next();
      int x=sc.nextInt();
      System.out.printf( "%-15s%03d %n", s1, x);

    System.out.println("================================");



   /* Scanner sc=new Scanner(System.in);
    List<String> myStringList= new ArrayList<>();
    List<String> myValueString= new ArrayList<>();
    List<Integer> intList= new ArrayList<>();
    for(int i=0;i<3;i++)
    {
      String s1=sc.next();
      int x=sc.nextInt();
    myStringList.add(s1);
      myValueString.add(s1);
    intList.add(x);
    }
    myStringList.sort(c);
    Collections.reverse(myStringList);
   Integer maxLength = myStringList.get(0).length();
   Integer empty =15-maxLength;

    System.out.println("================================");
    for (int i =0; i<myValueString.size();i++){
     int a =15- myValueString.get(i).length();
     if (intList.get(i)<100 && intList.get(i)>=10){

      System.out.println(myValueString.get(i)+getEmpty(a)+"0"+intList.get(i));
     } else if (intList.get(i)<10){
       System.out.println(myValueString.get(i)+getEmpty(a)+"00"+intList.get(i));

     }
    else {
       System.out.println(myValueString.get(i)+getEmpty(a)+intList.get(i));

     }
    }


    System.out.println("================================");*/

  }
}
