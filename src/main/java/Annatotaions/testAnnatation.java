package Annatotaions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Target ile global değişkenler,construcler,metod,paket
//nerede kullanaccaksak seçiyoruz.
//TYPE ile classlarda kullanabileceğiz

//Retention nasıl çalışacağı ile SOURCE=Sadece Görsel var derleyici yok sayıyor
//Class = deaful olarakda bu kullanılır derleme sırasında var ama calısma sırasında yok
//runtime = java reflection api ile calısma ananıta kullanulıyor çoğunlukla bu kkullanılır
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface testAnnatation {
  //bilgiler yer alıyor
  //değişkenler metod gibi çalışıyor
  //primitive,string class ve enum değişkenleri tnaımlanabilşyor
  String servicePath();
  String Protocol() default "SOAP";
  int port() default 8080;
  String[] users();

}
