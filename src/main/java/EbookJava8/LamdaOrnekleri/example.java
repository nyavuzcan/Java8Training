package EbookJava8.LamdaOrnekleri;

/**
 * @FunctionalInterface
 * public interface Consumer<T> {
 * void accept(T t); // t-> {}
 * }T tipindeki parametreyi alır ve tüketir/işler. Geriye değer döndürmez (void). T
 * burada herhangi bir sınıf tipi olabilir.
 *
 * örnek
 * Consumer<String> consumer = word -> {
 * System.out.println(word); // Merhaba Dünya
 * };
 * consumer.accept("Merhaba Dünya");
 * 5.2. BiConsumer Arayüzü
 * @FunctionalInterface
 */


/**BiConsumer Arayüzü
 *public interface BiConsumer<T, U> {
 * void accept(T t, U u); // (t,u) -> {}
 * }
 * CONSUMERIN 2 PARAMETRİLİSİ
 *
 */

import java.util.function.*;

/**
 * Function Arayüzü
 * @FunctionalInterface
 * public interface Function<T, R> {
 * R apply(T t); // t-> r
 * }
 *T tipinde bir parametre alır, işler ve R tipinde bir değer döndürür.
 *
 */
/**
 * UnaryOperator Arayüzü
 * @FunctionalInterface
 * public interface UnaryOperator<T> extends Function<T, T> {
 *Function türündendir. Eğer T ve R tipleri aynı türden ise, ismi UnaryOperator olur.
 *
 */

/**
 * BiFunction Arayüzü
 *@FunctionalInterface
 * public interface BiFunction<T, U, R> {
 * R apply(T t, U u); // (t,u) -> r
 * }T ve U tiplerinde iki parametre alır, R tipinde değer döndürür. T, U ve R herhangi
 * bir sınıf tipi olabilir. Function#apply tek parametre alırken Bi* iki parametre alır.
 */

/**
 BinaryOperator
 @FunctionalInterface
 public interface BinaryOperator<T> extends BiFunction<T,T,T> {
 }BiFunction türündendir. T, U ve R aynı tipte ise BinaryOperator kullanılabilir
 */

/**
 * Predicate Arayüzü
 * @FunctionalInterface
 * public interface Predicate<T> {
 * boolean test(T t); // t-> true/false
 * BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a > b);
 * boolean bigger = biPredicate.test(5,4); //
 * }
 * tipimde bir parametre alır, şarta bağlı olarak true/false değer döndürür.
 */

/**
 * BiPredicate
 *T ve U tiplerinde iki parametre alır, şarta bağlı olarak true/false döndürür
 */
 public class example {

  public static void main(String[] args) {
    Predicate<Integer> predicate = a-> (a>0);
    boolean pos = predicate.test(5); //true döncek

    Function<Integer, Double> function = t -> Math.pow(t,2);
    Double result = function.apply(5);
    System.out.println(result); // 25
    BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Sonuç:" +
        (a + b);
    String resultS = biFunction.apply(3,5);
    System.out.println(result); // Sonuç: 8

    BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
    Integer resultI = binaryOperator.apply(3,5);
    System.out.println(result);
 /*   UnaryOperator<Integer> unaryOperator = a -> Math.pow(a,5);
    Integer result = unaryOperator.apply(2);
    System.out.println(result); // 32
 */ }
}
