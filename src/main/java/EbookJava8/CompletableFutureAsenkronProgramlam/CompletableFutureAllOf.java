package EbookJava8.CompletableFutureAsenkronProgramlam;

import java.util.concurrent.CompletableFuture;

/**
 * Birden fazla CompletableFuture nesnesini birleştirir. Ancak herbir iş birden
 * tamamlandığında, CompletableFuture nesnesi tamamlandı bilgisine sahip olur.
 */
public class CompletableFutureAllOf {

  public static void main(String[] args) {
    CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("İlk görev tamamlandı..");
    });
    CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {

      try {
        Thread.sleep(15000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      System.out.println("Diğer görev tamamlandı..");
    });
    CompletableFuture<Void> allOf = CompletableFuture.allOf(future1,
        future2);

    System.out.println("Bir arada iki derede.");
    allOf.join(); //İLER BİTİNE KADAR BURDA BEKLEYECEK
    System.out.println("Bitti.");
  }
}
