package Annatotaions;

/*
@override = yazıldığı metod üzerinde kalıtıldıgı sınıf üzerinde aynı method var o  ezilioyr

@deprecated = bununla işaretlenen daha yeni bir versiyonu oldugu söyler derleyici

@suprisewarning derleyicini olumsuz gördüğü alanlarda uyarıyı ortadan kaldırmak için kullanırız

@repetable birden fazla annatotion tanımalama için aynı isimle


 */
@testAnnatation(servicePath = "https://localhost", Protocol = "SOAP",
    port = 8080, users = {"nevzat", "ezgi"}
)

public class webService {

  public static void main(String[] args) throws NoSuchMethodException {
    webService webService = new webService();
    webService.accessFromRemoteClass();

    testAnnatation ann = webService.getClass().getAnnotation(testAnnatation.class);
    System.out.println(ann.servicePath());
    System.out.println(ann.port());
    System.out.println(ann.Protocol());

    for (String isim : ann.users()) {
      System.out.println(isim);
    }

    testAnnatation vf = webService.getClass().getMethod("annx").getAnnotation(testAnnatation.class);

    System.out.println(vf.servicePath());
    System.out.println(vf.port());
    System.out.println(vf.Protocol());

    for (String isim : vf.users()) {
      System.out.println(isim);
    }

  }

  @testAnnatation(servicePath = "https://localhost", Protocol = "SOAP",
      port = 8080, users = {"nevzat", "aaaa"}
  )
  public void annx() {
    testAnnatation annatation = this.getClass().getAnnotation(testAnnatation.class);
    System.out.println(annatation.servicePath());
    System.out.println(annatation.port());
    System.out.println(annatation.Protocol());
  }


  public void accessFromRemoteClass() {
    System.out.println("**ACCESS");
    testAnnatation annatation = this.getClass().getAnnotation(testAnnatation.class);

    System.out.println(annatation.servicePath());
    System.out.println(annatation.port());
    System.out.println(annatation.Protocol());

    for (String isim : annatation.users()) {
      System.out.println(isim);
    }
  }


}
