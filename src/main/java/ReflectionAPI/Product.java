package ReflectionAPI;

import java.util.ArrayList;
import java.util.List;

public class Product extends Info {
  private String productName;

  private String category;

  private Double price;

  private List<String> parts = new ArrayList<String>();

  public Double discount(Double ratio){

    return price*100/ratio;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public List<String> getParts() {
    return parts;
  }

  public void setParts(List<String> parts) {
    this.parts = parts;
  }

  public Product(){

  }

  public Product(String productName, String category, Double price, List<String> parts) {
    this.productName = productName;
    this.category = category;
    this.price = price;
    this.parts = parts;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + super.getId() +
        "productName='" + productName + '\'' +
        ", category='" + category + '\'' +
        ", price=" + price +
        ", parts=" + parts +
        '}';
  }

}
