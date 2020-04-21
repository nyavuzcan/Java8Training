package EncapsulationAndAnstraction;

//Final İnhariante edilecemez
//Abstract olmayan class içine abstract method yazılamaz
//Abstract method'un body'si olamaz
//Abstract class içinde mecburi override yazılması istenen method
//abstract olarak tanımlanır
//Abstract olmayan method'unda mecburi olarak body'si tanımlanmalıdır
//Hem final hem abstract metod tanımlanamaz;
//Çünkü final override'i engellerken abstract zorunlu tutar
public abstract class calisan {
  public abstract void maas();
  final public void yetki(){
    System.out.println("en yetkili");
  }

}