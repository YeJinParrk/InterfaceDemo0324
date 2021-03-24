package com.example.interfaceprogames;

public class BankAccount {
    private double balance;
    private int accountNumber;
    private static int LastAssignedNumber=1000;

    public BankAccount(double balance) {
        this.balance = balance;
        LastAssignedNumber++;
        accountNumber = LastAssignedNumber;
    }

    public double getBalance() {
        return balance;
    }
}
