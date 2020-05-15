package HuaweiTest;

import javax.crypto.Mac;

class Machine{
  public int machineValue=0;
  public void start(){
    System.out.println("Machine started.");
  }
}

class Camera extends Machine{
  public int cameraValue =0;
  public void start(){
    System.out.println("Camera started");
  }
  public void snap(){
    System.out.println("Photo taken.");
  }
}

public class App {
  public static void main(String[] args) {
    Machine machine1 = new Machine();
    Camera camera1 = new Camera();

  machine1.start();
  camera1.start();
  camera1.snap();

  //Upcasting
    //Polymmorphisim
    Machine machine2 = new Camera(); //=camera1;
    //bununla yukardaki camera1 ayni yeri referans edebilir;
    machine2=camera1;
    machine2.start();
    //BU SEKİLDE ALT CLASSIN OVERRIDE ETTIGI
    //AYNI ISIMDEKİ METODUNA ERİŞTİK
    //EGER FARKLI İSİMDE OLAN METODUNA ERİŞMEK İSTESEYDİK
    //FOR SNAP METOD
    //Bu sayede Parent class'ın child classdan hangi metodlara
    //erişip hangilerine erişemeyeceğine karar verdik
    // Bu şekilde cast edilmesi gerekirdi
    // ((Camera) machine2).snap();

    System.out.println(machine2.machineValue);

    //System.out.println(machine2.cameraValue);
    //Upcasting ile machine cameraya referans ederek
    //normalde erişemeyeceği metoda erişti
    //fakat hala cameranın int value'sine erişemiyor.


    //DOWNCASTING
    Machine machine3 =new Camera();
    Camera camera2 =(Camera) machine3;
    camera2.start();
    camera2.snap();

    Machine machine4 = new Machine();
    //burda run timede hata alaıcaz
    //çünkü machine4 bir machine obje
    //ve ben bunu direk olarak cast edemem
    Camera camera3 = (Camera)machine4;
    camera3.start();

    Camera camera4 = new Camera();
    camera4 =(Camera) machine4;
    //aynı hata


  }
}
