package Online_Shopping_System;

//Electronics class
public class Electronics extends Product {
 private String warranty;

 public Electronics(String productId, String productName, double price, String warranty) {
     super(productId, productName, price);
     this.warranty = warranty;
 }

 public String getWarranty() {
     return warranty;
 }

 public void setWarranty(String warranty) {
     this.warranty = warranty;
 }

 @Override
 public void showProductDetails() {
     System.out.println("Electronics [ID: " + getProductId() + ", Name: " + getProductName() + 
             ", Price: $" + getPrice() + ", Warranty: " + warranty + "]");
 }
}

//Clothing class
/*public class Clothing extends Product {
 private String size;

 public Clothing(String productId, String productName, double price, String size) {
     super(productId, productName, price);
     this.size = size;
 }

 public String getSize() {
     return size;
 }

 public void setSize(String size) {
     this.size = size;
 }

 @Override
 public void showProductDetails() {
     System.out.println("Clothing [ID: " + getProductId() + ", Name: " + getProductName() + 
             ", Price: $" + getPrice() + ", Size: " + size + "]");
 }
}*/
