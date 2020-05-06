package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("dark", "beef", 20);
        hamburger.addAddition("lettuce", 1, 1);
        hamburger.addAddition("feta", 2, 1);
        hamburger.addAddition("tomato", 1.5, 1);
        hamburger.addAddition("onion", 0.75, 1);

        hamburger.addAddition("mustard", 0.2, 1);

        System.out.println("TOTAL: $" + String.format("%.2f", hamburger.getPrice()));


        System.out.println("\n\n***************** HEALTHY BURGER ********************* \n\n");

        HealthyBurger healthyBurger = new HealthyBurger("beef", 35);
        healthyBurger.addAddition("lettuce", 1, 1);
        healthyBurger.addAddition("feta", 2, 2);
        healthyBurger.addAddition("tomato", 0.4, 3);

        healthyBurger.addAddition("tooMuch", 1, 1);

        System.out.println("TOTAL: $" + String.format("%.2f", healthyBurger.getPrice()));
        System.out.println(healthyBurger.getAdditions());


        System.out.println("\n\n***************** DELUXE BURGER *********************\n\n");
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("white", "pork", 50);
        deluxeHamburger.addAddition("lettuce", 10, 1);
        System.out.println("TOTAL: $" + String.format("%.2f", deluxeHamburger.getPrice()));
        System.out.println(deluxeHamburger.getName());
    }
}
