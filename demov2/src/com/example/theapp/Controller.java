package com.example.theapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    // Create a dummy admin account
    Admin adminAccount = new Admin("adminUsername", "adminPassword");

    // Create a regular user account
    User regularUser = new User("user123", "userPassword", 0);


    // Create instances of the payment classes
    NewPlayerFreebie freebiePayment = new NewPlayerFreebie("New Player Freebie", "Special Item", true);
    StdPayment swordPayment = new StdPayment("Standard Purchase", "Sword", true, 100, "Coins");
    StdPayment shieldPayment = new StdPayment("Premium Purchase", "Shield", true, 20, "Gems");

    //initialize the UI elements and test variables
    @FXML
    private Text usernameText;
    @FXML
    private Text responseText;
    @FXML
    private Text coinCount;
    @FXML
    private Text gemCount;

    private int swordsBought = 0;
    private int shieldsBought = 0;
    //private boolean giftGot = false;
    @FXML
    private Text swordsBoughtText;
    @FXML
    private Text shieldsBoughtText;
    @FXML
    private Text giftGotText;
    @FXML
    private TextArea supportInput;
    @FXML
    private Button submitTicket;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        regularUser.setCoins(400);
        regularUser.setGems(150);
        setUserText();
        setCoinText();
        setGemText();
    }

    //a various library to set and process actions from the user
    @FXML
    private void setUserText() {
        String tempuser = regularUser.getUsername();
        usernameText.setText(tempuser);
    }

    @FXML
    private void setCoinText() {
        String tempcoin = String.valueOf(regularUser.getCoins());
        coinCount.setText(tempcoin);
    }

    @FXML
    private void setGemText() {
        String tempgem = String.valueOf(regularUser.getGems());
        gemCount.setText(tempgem);
    }

    @FXML
    private void setGiftGotText() {
        if(regularUser.isNewFlag()){
            giftGotText.setText("N");
        } else {
            giftGotText.setText("Y");
        }

    }

    @FXML
    protected void leaveThisPlace() throws InterruptedException {
        responseText.setText("Goodbye!");
        Platform.exit();
    }
    @FXML
    private void swordBuy() {
        int tempcoins = regularUser.getCoins();
        swordPayment.processPay(regularUser);
        if(tempcoins == regularUser.getCoins())
        {
            responseText.setText("Not enough money.");
        } else {
            swordsBought += 1;
            responseText.setText("Bought!");
        }
        swordsBoughtText.setText(String.valueOf(swordsBought));
        setCoinText();
    }
    @FXML
    private void shieldBuy() {
        int tempgems = regularUser.getGems();
        shieldPayment.processPay(regularUser);
        if(tempgems == regularUser.getGems())
        {
            responseText.setText("Not enough money.");
        } else {
            shieldsBought += 1;
            responseText.setText("Bought!");
        }
        shieldsBoughtText.setText(String.valueOf(shieldsBought));
        setGemText();
    }
    @FXML
    private void giftGet() {
        boolean tempflag = regularUser.isNewFlag();
        freebiePayment.processPay(regularUser);
        if(tempflag == regularUser.isNewFlag())
        {
            responseText.setText("You already have claimed your gift.");
        } else {
            responseText.setText("Claimed!");
        }
        setGiftGotText();
    }
    @FXML
    private void supportTicketEnable() {
        supportInput.setDisable(false);
        supportInput.setVisible(true);
        submitTicket.setDisable(false);
        submitTicket.setVisible(true);
    }
    @FXML
    private void submitTheTicket() {
        supportInput.setDisable(true);
        supportInput.setVisible(false);
        submitTicket.setDisable(true);
        submitTicket.setVisible(false);
        responseText.setText("Thank you for the report.");
    }







}
