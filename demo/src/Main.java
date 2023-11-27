public class Main {
    public static void main(String[] args) {

        // Create a dummy admin account
        Admin adminAccount = new Admin("adminUsername", "adminPassword");

        // Create a regular user account
        User regularUser = new User("user123", "userPassword", 0);

        // Access and print account information
        System.out.println("Admin Account:");
        System.out.println("Username: " + adminAccount.getUsername());
        System.out.println("Access Level: " + adminAccount.getAccessLevel());

        System.out.println("\nRegular User Account:");
        System.out.println("Username: " + regularUser.getUsername());
        System.out.println("Access Level: " + regularUser.getAccessLevel());
        System.out.println("Coins: " + regularUser.getCoins());
        System.out.println("Gems: " + regularUser.getGems());
        System.out.println("New Flag: " + regularUser.isNewFlag());


        // Create instances of the payment classes
        NewPlayerFreebie freebie = new NewPlayerFreebie("New Player Freebie", "Special Item", true);
        StdPayment standardPayment = new StdPayment("Standard Purchase", "Regular Item", true, 2000, "Coins");
        StdPayment premiumPayment = new StdPayment("Premium Purchase", "Regular Item", true, 200, "Gems");

        // Process payments
        freebie.processPay();
        standardPayment.processPay();

        // Get and print payment details
        System.out.println("\nStandard Payment Details:");
        System.out.println("Currency: " + standardPayment.getCurrency());
        System.out.println("Price: " + standardPayment.getPrice());
        System.out.println("Item: " + standardPayment.getItem());
        System.out.println("\nPremium Payment Details:");
        System.out.println("Currency: " + premiumPayment.getCurrency());
        System.out.println("Price: " + premiumPayment.getPrice());
        System.out.println("Item: " + premiumPayment.getItem());

        // Debugging or interaction with StdPayment
        standardPayment.printPaymentDetails();
        premiumPayment.printPaymentDetails();
    }
}