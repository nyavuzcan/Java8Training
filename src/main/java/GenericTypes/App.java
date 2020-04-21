package GenericTypes;
class calisan <benimTipim,valuetip,ver>{
  benimTipim maas;
  valuetip isim;
}
class veritipi<T>{
  String address;
  Integer zamorani ;
  T test;
}


public class App {
  public static void main(String[] args) {
    calisan<veritipi<String>,veritipi,veritipi> ali = new calisan<>();
    ali.maas=new veritipi();
  }
}
