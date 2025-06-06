package aetherpet.model;

import java.io.Serializable;

public class Stats implements Serializable {
    
    // Serializable State
    private static final long serialVersionUID = 1L;
    // Base Stats
    private int hunger = 50;
    private int happiness = 50;
    private int energy = 50;

    // Increase the Hunger level on Feed
    public void increaseHunger() { hunger = Math.min(100, hunger + 10); }
    // Increase the Happiness level on Play or Talk
    public void increaseHappiness(){ happiness = Math.min(100, happiness + 10); }
    // Increase the Energy level on Sleep
    public void increaseEnergy() { energy = Math.min(100, energy + 10); }
    
    // Decrease the Hunger level on Decay
    public void decreaseHunger() { hunger = (hunger - 10); }
    // Decrease the Happiness Level on Decay
    public void decreaseHappiness() { happiness = (happiness - 10); }
    // Decrease the Energy level on Decay
    public void decreaseEnergy() { energy = (energy - 10); }

    // Get The Current Mood if stats are below 30
    public String getMood(){
        // Extremely Satisfied State
        if (hunger >= 90) return "Stuffed";
        if (happiness >= 90) return "Ecstatic";
        if (energy >= 90) return "Animated";

        // Drained State
        if (hunger <= 30 && hunger > 10) return "Hungry.";
        if (happiness <= 30 && happiness > 10) return "Sad.";
        if (energy <= 30 && energy > 10) return "Tried.";
       
        // Bad State
        if (hunger <= 10 && hunger > 0) return "Famished...";
        if (happiness <= 10 && happiness > 0) return "Anxious...";
        if (energy <= 10 && energy > 0) return "Exhausted...";
        
        // Extreme State
        if (hunger <= 0) return "Dead!";
        if (happiness <= 0) return "Depressed!";
        if (energy <= 0) return "Passed out!";
        return "Happy";
    }

    public void display(){
        System.out.println("Hunger: " + hunger);
        System.out.println("Happiness: " + happiness);
        System.out.println("Energy: " + energy);
    }
}
