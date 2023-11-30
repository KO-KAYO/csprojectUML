package com.example.theapp;

public class NewPlayerFreebie extends Payment {
    // Constructor with a fixed price of 0 for freebies
    public NewPlayerFreebie(String purchaseName, String item, boolean flag) {
        super(purchaseName, item, flag, 0);
    }

    // Override the processPay method for freebies
    @Override
    public void processPay(User passedUser) {
        if (passedUser.isNewFlag()) {
            System.out.println("Processing freebie for " + purchaseName);
            passedUser.setNewFlagFalse();
        } else {
            System.out.println("Freebie option is disabled for " + purchaseName);
        }
    }
}