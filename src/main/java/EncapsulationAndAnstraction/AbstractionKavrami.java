package EncapsulationAndAnstraction;
//BİRDEN FAZLA VARLIK VARKEN KULLANILIR
//ABSTRACTION = GEREKLİ BİLGİLERİN AÇILMASI GEREKSİZLERİN SAKLANMASI
//İnsan makine soyutlaması
//Metod soyutlama, veri soyutlama, nesne soyutlama, Dışarıdan Soyutlamak
//Amaç dışarıdan elimizdekileri soyutlamak, dışlamak
//Masa ve üretimi gibi masadan beklenen ama arka planda ne yapıldıgı farkmaz
//Doğadaki varlıklar ve iletişimleri = Object orientead varlıkları gibidir
//Zaten OOP maksadı da insan düşünce yapısana en uygun pdüşünme şeklini amaçlamaktadır
//Nesneler arası iletişimi tanımlamak amacıyla
//GETTER SETTERdaki en önemli maksat aslında sınırları korumaktır
//Düzeni sağlamak ve Örneğin -300 yaş ataması yapılamamasıdır.

//ACCESS MODİEFRS


//protected sadece aynı package
//public her yerden
//private sadece kendi classından
//paket içi = protected YANİ DEFAULT İLE TEK FARK SUBCLASSLARDAN ERİŞELEMEMESİ DEFAULTA




public class AbstractionKavrami extends SadiEvren.Solution {
  public static void main(String[] args) {
    AbstractionKavrami abstractionKavrami = new AbstractionKavrami();
    System.out.println( abstractionKavrami.test);
  }
}
