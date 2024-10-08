package Online_Shopping_System;

public class Customer {
    private String customerId;
    private String customerName;
    private String email;

    public Customer(String customerId, String customerName, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showCustomerDetails() {
        System.out.println("Customer [ID: " + customerId + ", Name: " + customerName + ", Email: " + email + "]");
    }
}
