package Exception;
class benimException extends Exception{

}
//Throw= fırlatmak

//throw metoda yazılırsa o metodun cağırıldığı yerde de try veya throw edilmeli
class deneme {
  void f(int x) throws benimException {
    throw new benimException();
  }
}


public class Excepti {
  public static void main(String[] args) {
    deneme deneme = new deneme();
    try {
      deneme.f(4);
    }
     catch (benimException e) {
      e.printStackTrace();
    }
  }
}
