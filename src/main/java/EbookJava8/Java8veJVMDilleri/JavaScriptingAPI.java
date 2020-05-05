package EbookJava8.Java8veJVMDilleri;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Java programlama dili, tüm bu listeli dilleri koşturabilmek için ortak arayüzlerin
 * bulunduğu bir API sunmaktadır. Java Scripting API bileşenleri javax.script 4
 * paketi içerisinde bulunmaktadır.
 * javax.script paketi oldukça basit arayüz ve sınıflar içermektedir.Bunlardan en
 * önemlisi ScriptEngine arayüzüdür.
 * 10.3. ScriptEngine
 * ScriptEngine türünden nesneler, ScriptEngineManager#getEngineByName
 * metodu üzerinden eşsiz bir takma isim ile elde edilmektedir. Bu nesneler ile,
 * String
 * türünden kod blokları koşturulabilmekte, ayrıca Java ile iletişim kurulabilmektedir.
 * Örneğin, Nashorn JavaScript motoru için "nashorn" veya "rhino" takma adları,
 * Ruby için ise "jruby" takma adı kullanılmaktadır
 */
public class JavaScriptingAPI {

  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager engineManager = new ScriptEngineManager();
    ScriptEngine engine = engineManager.getEngineByName("nashorn");

    /**
     * ScriptEngine engine = engineManager.getEngineByName("nashorn"); JAVASCRPT
     * ScriptEngine engine = engineManager.getEngineByName("rhino");JAVASCRTP
     * ScriptEngine engine = engineManager.getEngineByName("jruby");JRUBY
     * ScriptEngine engine = engineManager.getEngineByName("jython");PYTHON
     *
     */
    ScriptEngineManager engineManager2 = new ScriptEngineManager();
    ScriptEngine engine2 = engineManager2.getEngineByName("nashorn");
    engine.eval("function topla(a,b){ return a + b; }");
    String sonuc=(String)engine.eval("topla(2,3);");
    System.out.println(sonuc);
  }

}
