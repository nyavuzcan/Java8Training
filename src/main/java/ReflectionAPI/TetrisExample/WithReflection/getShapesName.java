package ReflectionAPI.TetrisExample.WithReflection;

public class getShapesName {

  //SHAPE ISMINI VERİCZ SHAPE'İ DÖNDÜRÜCEK

  public static Shape getShape(String name) throws Exception{

    final String PATH="ReflectionAPI.TetrisExample.WithReflection.";
    Class cls = Class.forName(PATH+name);

    Object obj = cls.newInstance();

  return (Shape) obj;


  }


}
