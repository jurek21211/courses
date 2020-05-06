package com.company;

public class HealthyBurger extends Hamburger{
    private int maxAdditions, additionsCounter;
    public HealthyBurger(String meat, double price) {

        super("brown rye bread roll", meat, price);
        this.additionsCounter = 0;
        super.maxAdditions = 6;
        this.name = "Healthy Burger";
    }
}
