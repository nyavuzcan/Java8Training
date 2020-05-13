package HackerRankJava.Anagrams;





public class Solution {

  public static void main(String[] args) {
String a = "Hello";
    String b = "hlelo";
    String[] aArr=   a.toUpperCase().split("");
    String[] bArr=   b.toUpperCase().split("");
    java.util.List<String> aList = java.util.Arrays.stream(aArr).collect(java.util.stream.Collectors.toList());
    java.util.List<String> bList = java.util.Arrays.stream(bArr).collect(java.util.stream.Collectors.toList());

    java.util.Map<String, Integer> collectA =
        aList.stream().collect(java.util.stream.Collectors.groupingBy(  java.util.function.Function.identity(), java.util.stream.Collectors.summingInt(e -> 1)));

    java.util.Map<String, Integer> collectB =
        bList.stream().collect(java.util.stream.Collectors.groupingBy( java.util.function.Function.identity(),java.util.stream.Collectors. summingInt(e -> 1)));

    if (collectA.equals(collectB))
      System.out.println("eşit");
  }
}
