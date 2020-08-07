package DesignPatterns.CreationalPatterns.BuilderDesignPattern;

public class Company {

  private String name, phone, address;

  public Company(Builder builder) {
    this.name = builder.name;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  public static class Builder{

    private String name, phone, address;

    /**
     * @param name Company Name - (Required Field)
     */
    public Builder(String name){
      this.name = name;
    }

    /**
     * @param phone Company Phone - (Optional Field)
     */
    public Builder setPhone(String phone){
      this.phone = phone;
      return this;
    }

    /**
     * @param address Company Address - (Optional Field)
     */
    public Builder setAddress(String address){
      this.address = address;
      return this;
    }

    public Company build(){
      return new Company(this);
    }


  }

}