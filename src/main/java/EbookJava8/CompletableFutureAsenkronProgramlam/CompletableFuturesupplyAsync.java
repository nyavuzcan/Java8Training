package EbookJava8.CompletableFutureAsenkronProgramlam;

/**
 * CompletableFuture#supplyAsync metodu CompletableFuture#runAsync metodu
 * gibidir. Fakat koşma sonucunda geriye bir sonuç döndürebilmektedir. Bir iş
 * sonunda geriye hesaplanmış bir değer döndürmeye ihtiyaç duyulduğu noktada
 * kullanılabilir
 */
public class CompletableFuturesupplyAsync {
  /*
  CompletableFuture<List<Path>> future = CompletableFuture.supplyAsync(()
-> {
Stream<Path> list = Stream.of();
try {
list = Files.list(Paths.get("/var/log"));
} catch (IOException e) {
e.printStackTrace();
}
return list.collect(Collectors.toList());
});
   */
  /**
   * CompletableFuture#supplyAsync metodu Supplier
   * türünden bir nesne kabul ettiği için bir Lambda fonksiyonu
   * olarak temsil edilebilirdir. () → T
   */
  /**
   * CompletableFuture’in çoğu metodu işlerini asenkron olarak arkaplanda
   * koşturmaktadır. Bu sebeple mevcut uygulamanın akışını askıda bırakmamaktadır.
   * Bir CompletableFuture’in iş bitimindeki sonucunu elde etmenin iki yöntemi
   * bulunmaktadır.
   * join() metodu, asenkron olarak işletilen görev tamamlanana kadar
   * uygulama akışını askıda tutmaktadır. İş tamamlandığında ise varsa sonuç
   * değerini döndürmektedir.
   * 13.6. İkinci yol, thenAccept* metodu kullanmak
   * thenAccept metodu ile callback stilinde asenkron işlerin sonuçları elde edilebilir.
   * thenAccept metodu Consumer<T> türünden bir nesne kabul etmekte ve sonucu
   * onun üzerinden sunmaktadır.
   *
   * future.thenAccept( (List<Path> paths) -> {
   * // liste burada
   * });
   * Yukarıdaki thenAccept ile, CompletableFuture nesnesine bir hook tanımlanmış
   * olur. İş bitiminde sonuç elde edildiği zaman bu metod otomatik olarak işletilir.
   * Sonuç parametre olarak geliştiriciye sunulur.
   */
}
