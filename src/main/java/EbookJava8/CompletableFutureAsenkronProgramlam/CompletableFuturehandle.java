package EbookJava8.CompletableFutureAsenkronProgramlam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * CompletableFuture#handleAsync metodu bir önceki asenkron görevin
 * sonucunu işlemek ve ardındaki görevlere paslamak için yapılandırılmıştır.
 * CompletableFuture#handleAsync ile, birbirini besleyen zincirler şeklinde
 * asenkron iş akışları yazılabilir.
 * Örneğin, iki asenkron işten birini, diğerini besler şeklinde yapılandıralım
 * Görev 1
 * Asenkron olarak bir dizindeki tüm dosya ve dizinler bulunsun
 * Görev 2
 * Bulunan dizinlerin boyut bilgisi asenkron olarak hesaplansın
 * Görev 3
 * Dosya yolu ve boyut bilgisi asenkron olarak listelensin.
 */
public class CompletableFuturehandle {
  public static void main(String[] args) {

    CompletableFuture.supplyAsync(() -> {
      Stream<Path> list = Stream.of();
      try {
        list = Files.list(Paths.get("/var/log"));
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      return list.collect(Collectors.toList());
      //Dosya ve dizinleri liste olarak döndürür
    }).handleAsync((paths, throwable) -> {
      Map<Path, Long> pathSizeMap = new HashMap<>();
      try {
        for (Path path : paths) {
          long size = Files.size(path);
          pathSizeMap.put(path, size);
        }
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      //Elde ettiği listeden her bir dizinin boyutunu hesaplar, bir Map nesnesi olarak
      //sunar.
      return pathSizeMap;
    }).thenAccept(map -> {
      //En son üretilen Map nesnesinden dosya yolu ve boyutunu birbir çıktılar.
      for (Map.Entry<Path, Long> entry : map.entrySet()) {
        System.out.printf("%s | %d bytes %n",entry.getKey(),entry.getValue());
      }
    });
  }


}
