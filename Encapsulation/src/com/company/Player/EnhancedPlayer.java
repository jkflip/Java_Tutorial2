package com.company.Player;

public class EnhancedPlayer {

    private String name;
    private int hitpoint = 100;   // Define default value for health
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100){
            this.hitpoint =health;     // Some validation for values of health
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitpoint = this.hitpoint - damage;
        if(this.hitpoint <= 0){
            System.out.println("Player knocked out");
            // Reduce no. of lives from player
        }
    }

    public int getHealth() {
        return hitpoint;
    }
}
