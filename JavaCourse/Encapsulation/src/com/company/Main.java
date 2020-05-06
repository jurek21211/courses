package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Jurek";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.health);

        EnhancedPlayer player = new EnhancedPlayer("Jurek", "Sword", 50);
        System.out.println("Initial health is " + player.getHealth());

        Printer printer = new Printer(80, true);
        System.out.println(printer.getTonerLevel());
        printer.print(2);
        System.out.println(printer.getTonerLevel());
        printer.fillUpToner(60);
        System.out.println(printer.getTonerLevel());
        System.out.println(printer.getNumberOfPrintedPages());
    }
}
