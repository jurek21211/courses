package com.company;

public class Main {

    public static void main(String[] args) {
        Mercedes merc = new Mercedes("W124", 6);
        BMW bmw = new BMW("E90", 4);
        Audi audi = new Audi("A4", 4);

        merc.accelerate();
        merc.startEngine();
        merc.brake();
        System.out.println("\n****************\n");
        bmw.accelerate();
        bmw.startEngine();
        bmw.brake();
        System.out.println("\n****************\n");
        audi.accelerate();
        audi.startEngine();
        audi.brake();
    }
}
