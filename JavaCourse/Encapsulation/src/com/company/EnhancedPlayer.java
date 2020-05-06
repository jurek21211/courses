package com.company;

public class EnhancedPlayer {
    private String name, weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        if(health > 0 && health <= 100)
            this.health = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth(){
        return health;
    }
}
