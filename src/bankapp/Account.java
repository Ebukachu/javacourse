package bankapp;

public class Account {
    // Class variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // Class constructor
    Account(String name, String id) {
        customerName = name;
        customerID = id;
    }

    // Function for depositing money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    // Function for withdrawing money
    void withdraw (int amount){
        if (amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }
    // Function showing previous transaction



}
