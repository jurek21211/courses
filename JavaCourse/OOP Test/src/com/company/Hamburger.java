package com.company;

public class Hamburger {
    private String breadRollType, meat;
    protected String name, additions;
    private double price;
    private int additionsCounter;
    protected int maxAdditions;


    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.additionsCounter = 0;
        this.maxAdditions = 4;
        this.name = "Basic Burger";
        this.additions = "";
    }


    public void addAddition(String additionName, double additionPrice, int quantity) {
        if (this.additionsCounter < maxAdditions && this.additionsCounter + quantity <= maxAdditions) {
            this.additionsCounter += quantity;
            this.price += additionPrice;
            this.additions += additionName + " x" + quantity + ", $" + String.format("%.2f", additionPrice * quantity) + "; ";
            System.out.println(additionName.toUpperCase() + " x" + quantity + " added to order.");
        } else if (this.additionsCounter < maxAdditions) {
            System.out.println("You cannot add this quantity of an addition. You are able to add up to: "
                    + (maxAdditions - this.additionsCounter) + " item(s).");
        } else {
            System.out.println("You have reached limit of additions for " + this.name + "(" + maxAdditions + ")");
        }
    }


    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditions() {
        return additions;
    }
}
