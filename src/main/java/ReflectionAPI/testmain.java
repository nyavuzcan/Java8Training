package ReflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class testmain {
  public static void main(String[] args) throws Exception {
    Product product = new Product();
    System.out.println(product.getClass()); //Product'ın full path'i

    Class cls = Class.forName("ReflectionAPI.Product"); //
    // full path kullanarak bir nesne oluşturulmasıdır. Metodlarını kullanmak için invoke kullanılır.
    //cls.getMethod()
    //Product.class.getMethod()
    Object obj = cls.newInstance();  //newInstance metodu ile Object tipi olarak geri döndürür.

    Product product3 = (Product) obj;// // newInstance ile oluşturulmuş olan nesne Object olarak
    // oluşturulmuştur.
    // Product nesnesine cast ediyoruz.

    product3.getCategory();
    product3.getParts();
    product3.getPrice();
    product3.getId();
    product3.getProductName();

    product3.setCategory("category1");
    product3.setParts(new ArrayList<String>());
    product3.setPrice(100D);
    product3.setProductName("computer");
    product3.setId(10L);

    System.out.println("\n*** Invoke Methods (setCategory, getCategory) ***");

    Class[] cArgs = new Class[1];//SetCategory metodunun parametreleri
    cArgs[0] = String.class;

    Method method1 = cls.getMethod("setCategory", cArgs);
    method1.invoke(obj, "Electronic"); //oluşturdugumuz object ile o metodu parametresini vererek
    //o metodu cagırdık.

    Method method2 = cls.getMethod("getCategory",null);
    System.out.println(method2.invoke(obj,null));
    System.out.println("\n*** All Methods ***");
    Method[] allmethods= cls.getDeclaredMethods();
    Arrays.stream(allmethods).forEach(System.out::println);
    System.out.println("\n*** All Fields ***");
    Field[] fields = cls.getDeclaredFields();

    for (Field field: fields) {
      System.out.println(field.toString());
    }

    System.out.println("\n*** The superclass of product2 ***");
    System.out.println(cls.getSuperclass());




  }

}
