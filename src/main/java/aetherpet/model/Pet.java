package aetherpet.model;

import aetherpet.ui.*;

public class Pet {

    private String name;
    private Stats stats;
    private int turns;

    public Pet(String name) {
        this.name = name;
        this.stats = new Stats();
        this.turns = 0;
    }
    
    public int getTurns() { return turns; }

    // Action Steps
    public void feed() { stats.increaseHunger(); turns++; decay();}
    public void play() { stats.increaseHappiness(); turns++; decay();}
    public void sleep() { stats.increaseEnergy(); turns++; decay();}
    public void doNothing() {turns++; decay();}

    // Decay Steps
    public void decay() {
        if (turns % 3 == 0) {
            stats.decreaseHunger();
        }

        if (turns % 5 == 0) {
            stats.decreaseHappiness();
            stats.decreaseEnergy();
        }
    }

    public void displayStats() {
        System.out.println("\n" + name + "'s Current Stats:");
        stats.display();
    }

    public String getMoodArt(){
        return Art.getMood(stats.getMood());
    }
}
