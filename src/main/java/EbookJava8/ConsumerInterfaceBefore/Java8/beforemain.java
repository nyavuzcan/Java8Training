package EbookJava8.ConsumerInterfaceBefore.Java8;

public class beforemain {
  public static void main(String[] args) {
    Consumer<String> consumer = new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };

    consumer.accept("hello world");
  }
}

