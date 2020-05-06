package com.company;

public class Player {
    public String name, weapon;
    int health;

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked down");
        }
    }
}
