package com.example.theapp;

public abstract class Payment {
    protected String purchaseName;
    protected String item;
    protected boolean flag;
    protected double price;

    // Constructor
    public Payment(String purchaseName, String item, boolean flag, double price) {
        this.purchaseName = purchaseName;
        this.item = item;
        this.flag = flag;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract void processPay();
}