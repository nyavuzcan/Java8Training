package EbookJava8.AnatasyonlarveTekrarliAnatasyonlar;

import java.lang.annotation.*;

/**
 * @ işaretiyle başlayan arayüzlerdir ve notasyonlar içinde alanlar
 * tanımlanabilmektedir
 */

/**
 * Notasyonlar konfigürasyon amacıyla kullanılırken, barındırdığı değişken
 * alanlarından faydalanılmaktadır. Bu alanların tipi, ismi ve gerekirse varsayılan
 * değeri tanımlanabilmektedir.
 */
@Repeatable(Multiple.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
@interface Single{
String value() default "testClass";
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Multiple {
  Single[] value();
}/*
@Multiple(value = {
    @Single("Merhaba"),
    @Single("Jupiter")
})*/ //JAVA 8 İLE BU ZORUNLULUK ORTADAN KALKTI
//@Single("infoClass")
@Single("Merhaba")
@Single("Uranüs")
public class info {
  public static void main(String[] args) {
    Class<info> app = info.class;
    Single[] notz = app.getAnnotationsByType(Single.class);

    for (Single not : notz)
      System.out.println(not.value());
  }
}
