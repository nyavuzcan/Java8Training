package EbookJava8.STREAMAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * map ve reduce işlemleri birlikte kullanımı çok fazla tercih edilen iki operasyondur.
 * Bu operasyonları önemli kılan ise, bu iki operasyonun dağıtık sistemler için çok
 * uygun olmasıdır. Piyasada Map & Reduce işlemlerini dağıtık mimarilerde kullanan
 * birçok teknoloji bulunmaktadır. Tabiki Java 8 ile kullandığımız map & reduce ikilisi
 * tek JVM üzerinde koştuğu için dağıtık değildir.
 * • Hazelcast
 * • Hadoop
 * • MongoDB
 */
class Person {
  private String name;
  private Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}

public class MapAndReduce {

  public static void main(String[] args) {
    Person p1 = new Person("Ahmet", 12);
    Person p2 = new Person("Ali", 20);
    Person p3 = new Person("Ayşe", 30);
    Person p4 = new Person("Murat", 51);
    Person p5 = new Person("Zeynep", 60);

    List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);

    list
        .stream()
        .map(p -> p.getAge())
        .reduce(0, (a, b) -> (a + b));
    //Eğer yaşları nullsa patlarız o yüzden filtreleme yapıp nonNull getirilmeli

    list
        .stream()
        .filter(Objects::nonNull)
        .map(p->p.getAge())
        .reduce(0,(a,b)->(a+b));
  }
}
