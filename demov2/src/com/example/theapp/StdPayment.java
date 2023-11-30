package com.example.theapp;

public class StdPayment extends Payment {
    private String currency;

    // Constructor
    public StdPayment(String purchaseName, String item, boolean flag, int price, String currency) {
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
    public void processPay(User passedUser) {
        if (flag) {
            System.out.println("Processing payment for " + purchaseName);
            if(currency == "Coins"){
                int userCoins = passedUser.getCoins();

                if (userCoins < price){
                    System.out.println("Not enough money for " + purchaseName);
                } else {
                    userCoins -= price;
                    passedUser.setCoins(userCoins);
                    System.out.println("Bought " + purchaseName);
                }

            } else {

                int userGems = passedUser.getGems();

                if (userGems < price){
                    System.out.println("Not enough money for " + purchaseName);
                } else {
                    userGems -= price;
                    passedUser.setGems(userGems);
                    System.out.println("Bought " + purchaseName);
                }

            }
        } else {
            System.out.println("com.example.theapp.Payment option is disabled for " + purchaseName);
        }
    }
}