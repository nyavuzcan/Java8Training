package EbookJava8.DateTimeAPI;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Set;
/*
java.time paketindeki sınıfların genel olarak kurucu metodu private erişim
belirleyicisine sahiptir, bu sebeple new anahtar ifadesiyle oluşturulamazlar. Onun
yerine now, of , from, parse gibi metodlarla yeni nesneler oluşturulabilmektedir.
 */

/**
 * Bu paketteki classlar Immutable'dir bu sebeple bir nesne
 * oluşturulduktam sonra içerisindeki veriler kesinlikle düzenlenemezler.
 * Amaç thread-safety 'dir.
 */
public class timeMain {
  public static void main(String[] args) {
    //LocalDate
    LocalDate localDate =
    LocalDate.of(1998,07,19);
    LocalDate.of(1998,Month.AUGUST,19);

    LocalDate now = LocalDate.now(); // o anın tarihi


    now.withYear(2016); // burada immutable oldugu için
    //farklı bir nesne dmndğrğlğr
    now.with(ChronoField.YEAR,2012);
    now.with(ChronoField.MONTH_OF_YEAR,8);
    now.with(ChronoField.DAY_OF_MONTH,3);
    now.plusWeeks(2); // arrtırma
    now.minusWeeks(2); //azartma;
  //LOCALTIME
    //Saatsel zamanlar saat,dakika saniye,salise
    LocalTime nowTime= LocalTime.now();
    LocalTime time= LocalTime.of(18, 20, 55); // 18:20:55
    time.getHour(); // 18
    time.getMinute(); // 20
    time.getSecond();
    LocalTime.parse("10:05"); //10:05
    time
        .plusSeconds(45)
        .minusSeconds(5)
        .minus(5, ChronoUnit.SECONDS); // 18:20:35
  //LocalDateTime HEM TARİH HEM SAAT
    LocalDateTime nowDateTime = LocalDateTime.now();
    LocalDateTime dateTime =
        LocalDateTime.of(2014, Month.JANUARY, 3, 4, 5, 45);
    dateTime.getYear(); // 2014
    dateTime.getMonth(); // JANUARY
    dateTime.getDayOfMonth(); // 3
    dateTime.getHour(); // 4
    dateTime.getMinute(); // 5
    dateTime.getSecond(); // 45
// LocalDateTime2LocalDate ve LocalDateTime2LocalTime
    LocalDate date = dateTime.toLocalDate();
    LocalTime timex = dateTime.toLocalTime();


    //ZoneId Dünya üzerindeki saat dilimlerinin java taraflı nesnel karşılığı
    Set<String> zones = ZoneId.getAvailableZoneIds();
    //zones.stream().sorted().forEach(System.out::println);
    System.out.println(ZoneId.systemDefault());
    /**
     * jvm saat dilimini işletim sisteminden alır
     * değiştirmek istenir jvm options-
     * -Duser.timezone=Europe/Istanbul gibi. yazılır
     */

    //ZonedDateTime  saat dilimii katıştırılmış localdatetime denilebilir
    //saat diliminide içierir.
    ZonedDateTime.now(); //2014-04-05T16:33:16.320+03:00[Europe/Athens]
    ZoneId istanbul = ZoneId.of("Europe/Istanbul");
    ZonedDateTime.now(istanbul);
    // Japonyada tarih/saat kaç?
    ZonedDateTime.now(ZoneId.of("Japan"));
  }
}
