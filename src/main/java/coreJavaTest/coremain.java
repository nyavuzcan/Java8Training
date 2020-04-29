package coreJavaTest;

import sun.text.normalizer.Utility;

import javax.swing.text.Utilities;
import java.util.*;

public class coremain {


  // Driver code
  public static void main(String[] args)
  {
    List<String> stringList= new ArrayList<>();
    String a1= "nev";
    String b1= "ezg";

    stringList.add(a1);
    stringList.add(b1);



    test test  = new test();
    List<Integer> li= Arrays.asList();

    List<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
    list.stream().forEach(System.out::println);
    test.siralama(list);
    System.out.println("asdas");
    list.stream().forEach(System.out::println);


    String testString=null;
    String XTEST ="nevzat";

    if (Objects.nonNull(testString)&&testString.equals(XTEST)){
      System.out.println("ESİT");
    }


   String a ="nev";
   String b = "nev";

   if (a==b)
     System.out.println("true");
  }


}

