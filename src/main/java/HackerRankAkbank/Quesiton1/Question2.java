package HackerRankAkbank.Quesiton1;

import java.util.*;

//polındrom
public class Question2 {

  public static void main(String[] args) {
   String s ="aabaa";

   ArrayList<String> arrList = new ArrayList<>();
   arrList.addAll(Arrays.asList(s.split("")));
    List<String> finalList = new ArrayList<>();

    for (int z=0; z<arrList.size(); z++){


    String temp="";
    for (int i = z; i<arrList.size() ; i++){
     for (int j=i; j<i+1 ; j++ ){
       temp+=arrList.get(j);
     }
     if (isPolin(temp)) finalList.add(temp);
   }
    }

    Set<String> strings = new HashSet<>(finalList);
    System.out.println(strings.size());
  }

  public static boolean isPolin(String s){
    String [] arr = s.split("");

    ArrayList arrayList = new ArrayList();
    arrayList.addAll(Arrays.asList(arr));

    ArrayList<String> reverse= reverseArrayList(arrayList);

    if (reverse.equals(arrayList)) return true;
    return false;
  }

  public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
  {
    // Arraylist for storing reversed elements
    ArrayList<Integer> revArrayList = new ArrayList<Integer>();
    for (int i = alist.size() - 1; i >= 0; i--) {

      // Append the elements in reverse order
      revArrayList.add(alist.get(i));
    }

    // Return the reversed arraylist
    return revArrayList;
  }
}
