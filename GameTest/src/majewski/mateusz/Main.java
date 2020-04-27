package majewski.mateusz;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    ISaveable player = new Player("Tom", "Paladin", 12, 200);
        System.out.println(player.toString());
        saveObject(player);

        ISaveable newPlayer = new Player();
        loadObject(newPlayer);
        saveObject(newPlayer);

        ISaveable monster = new Monster();
        loadObject(monster);
        saveObject(monster);
    }

    public static void saveObject(ISaveable objectToSave) {
        List<String> values = objectToSave.write();
        for(int i = 0; i < values.size(); i++) {
            System.out.println("Saving " + values.get(i) + " to the storage");
        }
    }

    public static void loadObject(ISaveable objectToRead) {
        String simpleName = objectToRead.getClass().getSimpleName();
        List<String> values = readValues(simpleName);
        objectToRead.read(values);
    }

    public static List<String> readValues(String simpleName) {
        List<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Enter 4 " + simpleName.toLowerCase() + " values");

        while (!quit) {
            if(simpleName.equals("Player")) {
                if (index == 0) {
                    System.out.print("Enter " + simpleName.toLowerCase()  + " name: ");
                } else if (index == 1) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " class: ");
                } else if (index == 2) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " level: ");
                } else if (index == 3) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " health: ");
                }
            } else if (simpleName.equals("Monster")){
                if (index == 0) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " name: ");
                } else if (index == 1) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " class: ");
                } else if (index == 2) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " level: ");
                } else if (index == 3) {
                    System.out.print("Enter " + simpleName.toLowerCase() + " health: ");
                }
            }
            String stringInput = scanner.nextLine();
            values.add(index, stringInput);
            index++;
            if (index == 4) {
                quit = true;
            }
            }
        return values;
        }
    }
