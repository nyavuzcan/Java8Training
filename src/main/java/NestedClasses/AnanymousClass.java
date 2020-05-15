package NestedClasses;
//ANANYMOUS CLASSLAR İSİM VERİLMEYEN İNNER CLASSLARDIR
//ÜRETİLEN OBJEYE O ANDA ek özellikler veya tanımlananları override
//edip ezmek gibi

//ANANYMOUS CLASS SADECE 1 KERE KULLANILIR

public class AnanymousClass {
  String name ="Ahmet";
  public void rt(){
    System.out.println(name);

  }

  AnanymousClass ann = new AnanymousClass() {

    String name = "Nevzat";
    public void rt(){
      System.out.println(name);
    }
  };

public void x() {


}

  public static void main(String[] args) {
    AnanymousClass AcanymousClass = new AnanymousClass();
    AnanymousClass c = new AnanymousClass();

  }
}
