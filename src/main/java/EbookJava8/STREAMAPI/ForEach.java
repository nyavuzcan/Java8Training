package EbookJava8.STREAMAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ForEach {
  public static void main(String[] args) {
    List<String> names =
        Arrays.asList("Ali","Veli","Selami","Cem","Zeynel","Can","Hüseyin");
    Stream<String> stream = names.stream();
    stream.forEach(name -> {
      System.out.println(name);
    });

    // veya stream.forEach(System.out::println);
  }
}
