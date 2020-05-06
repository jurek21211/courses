package com.company;

public class BankAccount {
    private double balance;
    private String accountNumber, customerName, email, phoneNumber;

    public BankAccount() {
        this("5945", 0.0, "Name", "email", "phoneNumber");
        System.out.println("empty constructor call");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("999", 100.55, customerName, email, phoneNumber);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(long amount) {
        if (amount <= 0)
            System.out.println("Invalid value");
        else {
            this.balance += amount;
            System.out.println("Money deposited on your account. The balance is now: " + this.balance);
        }
    }

    public void withdrawMoney(long amount) {
        if (amount <= 0 || amount > this.balance)
            System.out.println("Invalid Value or not enough money on the account.");

        else {
            this.balance -= amount;
            System.out.println("Money withdrawn from your account. The balance is now: " + this.balance);
        }
    }

}
