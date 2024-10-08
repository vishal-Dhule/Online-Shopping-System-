package Online_Shopping_System;

import java.util.ArrayList;

public class Order implements OrderInterface {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> products;
    private double totalAmount;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Method to add product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice();
    }

    // Show order details
    @Override
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        customer.showCustomerDetails();
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.showProductDetails();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
