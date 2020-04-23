package DownAndUpCASTING;

public class insan {
  private String name;
  private Integer yas;

  public insan() {
  }
  public insan(String name, Integer yas) {
    this.name = name;
    this.yas = yas;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getYas() {
    return yas;
  }

  public void setYas(Integer yas) {
    this.yas = yas;
  }

  public void takeIt(){
    System.out.println("aldım");
  }
}
