package com.company.Player;

public class Player {

    public String name;
    public int health;
    public String weapon;

    // no constructors
    // Create 2 methods instead
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // Reduce no. of lives from player
        }
    }

    public int healthRemaining(){
        return this.health;
    }



}
