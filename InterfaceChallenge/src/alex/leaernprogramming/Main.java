package alex.leaernprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players alex = new Players("Alex", 2, 100);
        System.out.println(alex.toString());
        saveObject(alex);

        alex.setHitPoints(8);
        System.out.println(alex);
        alex.setWeapon("AK-47");
        saveObject(alex);
    //    loadObject(alex);
        System.out.println(alex);


        ISaveable babaika = new Monsters("Babaika", 1, 300);
        System.out.println(" Strength " + ((Monsters) babaika).getStrength());
        saveObject(babaika);
        loadObject(babaika);
        System.out.println(babaika);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {//parsing parameters to ISavable
        for (int i = 0; i < objectToSave.write().size(); i++) //
        {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");// getting values from array list
            // " public List<String> write()"
        }
    }

    public static void loadObject(ISaveable objectToLoad) {//
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}



