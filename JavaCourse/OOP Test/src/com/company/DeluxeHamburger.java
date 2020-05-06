package com.company;

public class DeluxeHamburger extends Hamburger{

    private int additionCounter;
    public DeluxeHamburger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        super.maxAdditions = 1;
        this.additionCounter = 0;
        this.addChipsAndDrink();
        this.name = "Deluxe Hamburger";
    }

    private void addChipsAndDrink(){
        super.additions += "Chips and drink";
        System.out.println("Chips and drink x1 added to order.");
        this.additionCounter += 1;
    }

    @Override
    public void addAddition(String additionName, double additionPrice, int quantity) {
        System.out.println("No additions allowed for this burger.");
    }
}
