package aetherpet.engine;

import java.util.Scanner;
import aetherpet.model.*;
import aetherpet.logic.*;

public class GameEngine {

    private Pet pet;
    private Scanner scanner = new Scanner(System.in);

    public void run(){
        System.out.println("Welcome to AetherPet!");
        System.out.println("Enter your pet's name: ");
        System.out.print("> ");
        String name = scanner.nextLine();

        pet = new Pet(name);
        runMainMenu();
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

            String choice = scanner.nextLine();

            ActionHandler.handle(choice, pet);

            if (choice.equals("6")) break;
        }
    }
}
