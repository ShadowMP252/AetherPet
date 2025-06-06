package aetherpet.logic;

import aetherpet.model.Pet;

public class ActionHandler {

    public static void handle(String input, Pet pet){
        switch(input){
            case "1":
                pet.feed();
                System.out.println("You fed your pet!");
                System.out.println(pet.getMoodArt());
                break;
            
            case "2":
                pet.play();
                System.out.println("You played with your pet!");
                System.out.println(pet.getMoodArt());
                break;
            
            case "3":
                pet.sleep();
                System.out.println("You pet took a nap!");
                System.out.println(pet.getMoodArt());
                break;
            
            case "4":
                pet.doNothing();
                System.out.println("You did nothing");
                System.out.println(pet.getMoodArt());
                break;
            
            case "5":
                pet.displayStats();
                System.out.println(pet.getMoodArt());
                break;
            
            case "6":
                System.out.println("Goodbye!");
                System.out.println("(╥﹏╥)");
                break;
            
            default:
                System.out.println("Invalid Option...");
        }
    }
}
