package aetherpet.logic;

import aetherpet.model.Pet;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Save {

    private static final String SAVE_DIRECTORY = "saves/";

    public static void saveState(Pet pet) {
        try {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm").format(new Date());
            String filename = SAVE_DIRECTORY + pet.getName() + "_" + timestamp + ".save";

            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject(pet);
            out.close();

            System.out.println("Pet saved to: " + filename);
        } catch (IOException e) {
            System.out.println("Failed to save pet: " + e.getMessage());
        }
    }

    public static Pet getState() {
        File folder = new File(SAVE_DIRECTORY);
        File[] saves = folder.listFiles((dir, name) -> name.endsWith(".save"));

        if (saves == null || saves.length == 0) {
            System.out.println("No save files found.");
            return null;
        }

        System.out.println("Available Saves:");
        for (int i = 0; i < saves.length; i++) {
            System.out.println((i + 1) + ") " + saves[i].getName());
        }

        System.out.print("Select a save file (number): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        if (choice < 1 || choice > saves.length) {
            System.out.println("Invalid choice.");
            scanner.close();
            return null;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(saves[choice - 1]))) {
            Pet pet = (Pet) in.readObject();
            System.out.println("Pet loaded from: " + saves[choice - 1].getName());
            return pet;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Failed to load pet: " + e.getMessage());
            scanner.close();
            return null;
        }
    }
}

