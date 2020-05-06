package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount myBankAcc = new BankAccount();
        myBankAcc.setAccountNumber("12 34 56 78 90");
        myBankAcc.setCustomerName("Jurek");
        myBankAcc.setBalance(1000);
        myBankAcc.setEmail("jurek@jurek.pl");
        myBankAcc.setPhoneNumber("+48 123 123 123");
        System.out.println(myBankAcc.getBalance());
        myBankAcc.depositMoney(150);
        System.out.println(myBankAcc.getBalance());
        myBankAcc.withdrawMoney(1000);
        System.out.println(myBankAcc.getBalance());

        BankAccount bobs = new BankAccount("4444", 0.5, "bob", "bob@bob.mail", "13-13-13");

        BankAccount tims = new BankAccount("Tim", "tim@tim.com", "12345");
        System.out.println(tims.getBalance());
        
    }
}
