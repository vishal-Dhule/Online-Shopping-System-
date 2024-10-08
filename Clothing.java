package Online_Shopping_System;

//Clothing class
public class Clothing extends Product {
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
}
