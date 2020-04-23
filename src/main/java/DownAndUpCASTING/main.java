package DownAndUpCASTING;

public class main {
  public static void main(String[] args) {
    erkek erkek = new erkek("nevzat",2);
    /*
    Üst sınıfa dönüştürülürken dikkat edilmesi gereken şudur.
    Üst sınıfa dönüştürülen nesne kendi sınıfındaki özel
    metotlara erişemezler.
    Sadece
    Override edilmiş metotlara ve üst sınıfın metotlarına erişebilirler.
     */
    insan insan1 = (insan)erkek;
    System.out.println("UPCASTONG"+ insan1.getName());

    /**
     * Üst sınıftaki Nesneyi alt sınıflara Cast etmemizin sebebi.
     * İstenilen nesnenin sadece istenilen metotlarına erişmesini
     * sağlamaktır.
     * Nesneler arasında Casting(Dönüştürme) işlemi yapabilmemiz için mutlaka aralarında inheritance ilişkisi olması lazım.
     */
    //DOWN CASTING
    erkek erkek2 = (erkek) new insan("ahmet",3);
    erkek2.sadeceErkekler();


  }
}
