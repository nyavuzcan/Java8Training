package EbookJava8.STREAMAPI;

import java.util.stream.IntStream;

/**
 *Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme
 * sürecinde, bir önceki adımda elde edilen sonuç bir sonraki adıma girdi olarak
 * sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır
 *Stream#reduce metodu ilk parametrede identity değeri, ikinci parametrede ise
 * BinaryOperator türünden bir nesne kabul etmektedir.
 * reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi
 * tutulmaktadır. İşleme başlarken bir önceki değer olmadığı için bu değer identity
 * parametresinde tanımlanmaktadır.
 */
public class Reduce {
  public static void main(String[] args) {
    //1,2,3,4,5 sayılarının toplamını hesaplayalım.

    IntStream
        .of(1, 2, 3, 4, 5)
        .reduce(0, (once, sonra) -> {
          System.out.format("%d - %d %n", once, sonra);
          return once + sonra;
        });

    // Lambda ile
   IntStream
        .of(1, 2, 3, 4, 5)
        .reduce(1, (once, sonra) -> once*sonra);
// veya Method reference ile
   IntStream
        .of(1, 2, 3, 4, 5)
        .reduce(1, Math::multiplyExact);
  }
}
