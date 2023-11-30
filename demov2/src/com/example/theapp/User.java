package com.example.theapp;

// com.example.theapp.User class (inherited from com.example.theapp.Account)
public class User extends Account {
    private int coins;
    private int gems;
    private boolean newFlag;

    // Constructor
    public User(String username, String password, int accessLevel) {
        super(username, password, accessLevel);
        this.coins = 0;
        this.gems = 0;
        this.newFlag = true;
    }

    // Getters and setters for coins, gems, and newFlag
    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getGems() {
        return gems;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    public boolean isNewFlag() {
        return newFlag;
    }

    // Setter for newFlag (can only set it to false)
    public void setNewFlagFalse() {
        this.newFlag = false;
    }
}