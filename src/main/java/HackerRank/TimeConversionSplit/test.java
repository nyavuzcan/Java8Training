package HackerRank.TimeConversionSplit;

public class test {
  static String timeConversion(String s) {
      //s.endWiths
      //s.startWiths


      String [] arrS = s.split(":");
    String rt="";
      if (s.contains("PM")){
        String []tempPM = arrS[2].split("");
        Integer temp = 0;
            if (arrS[0].equals("12")){
               temp = 12;
              rt = temp+":"+arrS[1]+":"+tempPM[0]+tempPM[1];
              System.out.println(rt);
              return rt;
            }
          else {
               temp = Integer.parseInt(arrS[0]);
              temp+=12;
            }


        rt = temp+":"+arrS[1]+":"+tempPM[0]+tempPM[1];
        System.out.println(temp+":"+arrS[1]+":"+tempPM[0]+tempPM[1]);
      }else {
        String []temp = arrS[2].split("");
        Integer tempx = 0;
        if (arrS[0].equals("12")){
          tempx = 00;
          rt = tempx+"0"+":"+arrS[1]+":"+temp[0]+temp[1];
          System.out.println(rt);
          return rt;
        }
        System.out.println(arrS[0]+":"+arrS[1]+":"+temp[0]+temp[1]);

        rt = arrS[0]+":"+arrS[1]+":"+temp[0]+temp[1];

      }
      return rt;
  }

  public static void main(String[] args) {
    timeConversion("12:45:54PM");

  }
}
