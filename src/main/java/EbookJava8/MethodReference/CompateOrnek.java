package EbookJava8.MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompateOrnek {
  public List<Integer> numbers = Arrays.asList(5, 10, 1, 5, 6);

  /**
   *
   * Comparator biFuncyion ile birebir aynısı
   *
   */
  public static void main(String[] args) {
    CompateOrnek compateOrnek = new CompateOrnek();
    Collections.sort(compateOrnek.numbers, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return 0;
      }
    });

    Collections.sort(compateOrnek.numbers,compateOrnek::sirala);
  }

  public Integer sirala(Integer o1, Integer o2){
    return o1 - o2;
  }
}
