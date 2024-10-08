package Online_Shopping_System;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating Customer
        Customer customer = new Customer("C001", "John Doe", "john@example.com");

        // Creating Products
        Product laptop = new Electronics("P001", "Laptop", 1200.00, "2 years");
        Product tshirt = new Clothing("P002", "T-Shirt", 25.00, "L");

        // Creating an Order
        Order order = new Order("O001", customer);
        
        // Adding products to the order
        order.addProduct(laptop);
        order.addProduct(tshirt);

        // Displaying order details
        order.showOrderDetails();
        
        sc.close();
    }
}
