package HackerRank.GradingStudentRoundConditional;

import java.util.ArrayList;
import java.util.List;

public class testMain {
  public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> rtList = new ArrayList<>();
    for(Integer grade : grades){
      if (grade<35){
        rtList.add(grade);

      } else {
        int remain = grade%5;
        if (remain<3){
          rtList.add(grade);

        } else {
          rtList.add(grade+(5-remain));
        }
      }
    }
  return rtList;
  }

  public static void main(String[] args) {


  }
}
