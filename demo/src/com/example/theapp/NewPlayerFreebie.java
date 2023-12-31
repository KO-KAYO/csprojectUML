package com.example.theapp;// com.example.theapp.NewPlayerFreebie class (directly inherits from com.example.theapp.Payment)

public class NewPlayerFreebie extends Payment {
    // Constructor with a fixed price of 0 for freebies
    public NewPlayerFreebie(String purchaseName, String item, boolean flag) {
        super(purchaseName, item, flag, 0);
    }

    // Override the processPay method for freebies
    @Override
    public void processPay() {
        if (flag) {
            System.out.println("Processing freebie for " + purchaseName);
            // Additional processing logic for freebies
        } else {
            System.out.println("Freebie option is disabled for " + purchaseName);
        }
    }
}