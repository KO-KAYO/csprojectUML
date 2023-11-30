package com.example.theapp;

public class Admin extends Account {
    // Constructor
    public Admin(String username, String password) {
        // For now, let's assume a default access level and variables for admin accounts
        super(username, password, 1);
    }
}
