package EbookJava8.CompletableFutureAsenkronProgramlam;

import java.util.concurrent.CompletableFuture;

/**
 * İki asenkron iş birden tamamlandığında bir Runnable türünden nesneyi
 * koşturmayı sağlar.
 */
/*
public class runAfterBoth {
  public static void main(String[] args) {
    CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() ->
    {
      return 10;
    });
    future1.runAfterBoth(future2,()->{
      System.out.println("İkisi birden bitti");
  }

  }
}
*/
/**
 * CompletableFuture#runAfterEither*
 * İki asenkron işden herhangi biri tamamlandığında bir Runnable türünden nesneyi
 * koşturmayı sağlar.
 */
