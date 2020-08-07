package coreJavaTest;

import java.util.Objects;

public class StringOperationTest {

  private final static String trendyolHomePage = "https://www.trendyol.com";
  private final static String trendyolHomePageContain = "/butik/liste/";
  private final static String test = "https://www.trendyol.com/butik/liste";
  private final static Integer startIndex = 0;
  private final static Integer lastIndex = 36;
  public static void main(String[] args) {

        String url = "https://www.trendyol.com/casio/erkek-kol-saati-p-1925865?boutiqueId=439892";
      if (Objects.nonNull(url.split("boutiqueId=")))
       // System.out.println(url.split("boutiqueId=")[1].split("&")[0]);

    System.out.println(UrlShortener.encode(351510008));
    System.out.println(UrlShortener.decode("www.trendyo.com9asaasdasdasdarasdasdasdsadasdasdasdasdasdasdassdasdasdsa"));
  }



}
