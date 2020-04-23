package ReflectionAPI.TetrisExample.WithReflection;

public abstract class Shape {
private String name;

public  String getName(){
  return name;
}

  public void setName(String name) {
    this.name = name;
  }

  public void reverse(){
    System.out.println(name+ " is reverse..");
  }
}
