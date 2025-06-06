package aetherpet.engine;

import java.util.Scanner;
import aetherpet.model.*; // Import Stats and Pets
import aetherpet.logic.*; // Import ActionHandler

public class GameEngine {

    private Pet pet;
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Welcome to AetherPet!");
        
        System.out.println("Load previous pet? (y/n): ");
        System.out.print("> ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            pet = Save.getState();
            if (pet == null) {
                System.out.println("Failed to get load save. Creating new pet...");
                createNewPet();
            } else {
                System.out.println("Loaded old pet: " + pet.getName() + "\nTurns: " + pet.getTurns());
                System.out.println(pet.getMoodArt());
            }
        } else {
            createNewPet();
        }

        runMainMenu();
    }
    

    // NOTE need a function to clear terminal and then reapply runMainMenu...
    
    private void createNewPet() {
        System.out.print("Enter new pet name: ");
        String name = scanner.nextLine();
        pet = new Pet(name);
    }

    private void runMainMenu(){
        while (true) {
            System.out.println("\nTurn: " + pet.getTurns());
            System.out.println("\nWhat would you like to do?");
            System.out.println("1) Feed");
            System.out.println("2) Play");
            System.out.println("3) Sleep");
            System.out.println("4) Nothing");
            System.out.println("5) View Stats");
            System.out.println("6) Exit");
            System.out.print("> ");

            String input = scanner.nextLine();

            ActionHandler.handle(input, pet);

            if (input.equals("6")) break;
        }
    }
}
