package com.example.theapp;// com.example.theapp.StdPayment class (inherits from com.example.theapp.Payment)

public class StdPayment extends Payment {
    private String currency;

    // Constructor
    public StdPayment(String purchaseName, String item, boolean flag, double price, String currency) {
        super(purchaseName, item, flag, price);
        this.currency = currency;
    }

    // Getter methods
    public String getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

    // Additional method for debugging or interaction
    public void printPaymentDetails() {
        System.out.println("Purchase: " + purchaseName);
        System.out.println("Item: " + item);
        System.out.println("Price: " + price + " " + currency);
    }

    // Override the processPay method for standard payments
    @Override
    public void processPay() {
        if (flag) {
            System.out.println("Processing payment for " + purchaseName);
            // Additional processing logic for standard payments
        } else {
            System.out.println("com.example.theapp.Payment option is disabled for " + purchaseName);
        }
    }
}