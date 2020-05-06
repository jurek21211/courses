package com.company;

public class VipCustomer {

    private String name, email;
    private double creditLimit;

    public VipCustomer() {
        this("Default Name", 100.0, "default@email.com");
    }

    public VipCustomer(String name, String email) {
        this(name, 1000.0, email);
        System.out.println(name + this.creditLimit + email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }


}
