package coreJavaTest;

import java.util.HashMap;
import java.util.List;

public class test {
  public Integer[][] arr=new Integer[5][5];
  public HashMap<String,String> hashMap;
 public test(){
   this.arr[0][0]=1;
   hashMap =new HashMap<>();


 }

 public void siralama(List<Integer> a){
   a.remove(1);
 }


}
