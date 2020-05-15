package EbookJava8.DefaultMethods;

/**
 *Default method =defender meth= virtural extension met
 * java8 öncelisin interface'de sadece soyut metodlar. yani gövdeli somut
 * metodlar yojty
 * public interface Arac {
 * void gazla() {
 * // bla bla bla
 * };
 * }  böyle bir şey yoktu
 *
 */
/**
 * java 8 ile beraber default anatar kelimesiyle tanımlama bir veya daha fazla
 * yapılabilmekte
 *//**
 !!!!!!
 DEFAULT METHODLARIN EN ÖNEMLİ AMACI HEM BİRDEN COK INTERFACE I INHERİTANCE
 ALIP DAHA SONRA HEMDE ZORUNLU KILMAMAK BUNUN İCİN KOLAYLIK SAGLAR
 AYRICA LAMDA EKSPRESSİON'I DA ETKİLEMEZ. METHOD VARSA SOYUT GÖVDESİZ VE 1 TANE
 AYNI SEKİLDE REFERANS VERİLEBİLİR.

 !!!!!
 */
interface repo{
  default void gazla() {
    System.out.println("Araç çalışıyor");
  }
}

/**
 * !!! İMPLEMENT EDİLDİGİ ZAMAN DEFAULT OVERRİDE ZORUNLUGU YOK
 */

interface alt extends  repo{
//kalıtım olarak almakta
}

interface dupl {
  default void gazla(){
    System.out.println("dup");
  }

}
public class info  implements  alt,repo{

  // repo repo = new repo();
 //obje oluştuturken override zorunlu
  public static void main(String[] args) {

  } /**
  aynı isimde metod içeren interface'leri impl ettiğimizde
   mecburen birini override etmeliyiz.
   İşte bu noktada <arayüz-adı>.super.<metod-adı>() biçimi ile arayüzlerdeki
   varsayılan metodlar çakışma olmadan koşturulabilmektedir
   */

}
