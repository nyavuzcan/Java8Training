package EbookJava8.CompletableFutureAsenkronProgramlam;

import java.util.concurrent.CompletableFuture;

public class CompletableFutreTEST {
  /*
  public class CompletableFutreTEST {
return f;
}
   *//**
 CompletableFuture#runAsync metodu Runnable türünden bir görev sınıfı kabul
 etmektedir, arından CompletableFuture türünden bir nesne döndürmektedir.
 Parametre olarak iletilen Runnable nesnesi, arkaplanda asenkron olarak
 koşturulmaktadır.*/
  /**
   * !!!
   * Runnable arayüzü tek bir soyut metoda sahip olduğu için,
   * Lambda fonksiyonu olarak temsil edilebilir. () → { }
   * functional interface
   */
  CompletableFuture<Void> futured1 = CompletableFuture.runAsync(() -> {
      //  fetchFromDatabase();
      });
  CompletableFuture<Void> futured2 = CompletableFuture.runAsync(() -> {
  //  saveToFile();
  });
//  futured1.join();
// futured2.join();
/**
 * Yukarıdaki (1) ve (2) numaralı işler bu noktadan sonra arkaplanda ForkJoin
 * thread havuzu içinde koşturulmuş olacak. Böylece (2) numaralı iş, (1) numaralı
 * iş koşturulmaya başlatıldıktan hemen sonra çalışmaya başlayacak, diğerinin işe
 * koyulmasını bloke etmeyecek.
 *///Peki şimdi bu iki asenkron görevin tamamlanma süresi ne kadar olacak?
  //Cevap: Math.max(5,3) = 5
  /**
   * Burada iki iş birden hemen hemen aynı anda başlayacağı için, iki işin toplamda
   * tamamlanma süresi yaklaşık olarak en fazla süren görev kadar olacaktır.
   *//**
 CompletableFuture#join metodu, asenkron olarak
 koşturulan görev tamamlanana kadar, uygulama akışının
 mevcut satırda askıda kalmasını sağlar. Yani (3) ve (4)
 satırlarından sonraki satırlarda, yukarıdaki iki işin birden
 tamamlanmış olduğunu garanti edebiliriz*/
}
