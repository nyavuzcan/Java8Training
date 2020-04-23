package ReflectionAPI.TetrisExample.WithReflection;

public class main {

  public static void main(String[] args) throws Exception {
    getShapesName getShapesName = new getShapesName();
     I i = (I) getShapesName.getShape("I");

     i.reverse();
     H h = (H) getShapesName.getShape("H");
     T  t= (T) getShapesName.getShape("T");
    /**
     *
     * YENİ BİR CLASS EKLESEK DAHİL DİREK OLARAK YAZIP
     * CAGIRABİLECEK REFLECTİON KULLANMASAYDIK
     * SÜREKLİ OLARAK İF ELSE İLE KONTROL EDEREK ONA GÖRE
     * EKLEME YAPACAKTIK
     */
  }

}
