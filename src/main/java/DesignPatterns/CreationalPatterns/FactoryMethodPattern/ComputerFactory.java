package DesignPatterns.CreationalPatterns.FactoryMethodPattern;

/**
 * Static metod ile daha optimize bir şekilde nesne üretilir
 * Factory Class'ı hangi sınıfı oluşturmak istediğini bilmiyor
 * sadece Computer interface'inden türüyen bir sınıf olduğunu biliyor
 * ki dönüş tipi Computer.
 */
public class ComputerFactory {
  public static Computer createComputer(Class aClass) throws IllegalAccessException, InstantiationException {
    return (Computer) aClass.newInstance();
  }
}
