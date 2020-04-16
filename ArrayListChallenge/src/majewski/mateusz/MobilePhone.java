package majewski.mateusz;

import java.util.Scanner;

public class MobilePhone {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact contact = new Contact();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printMenu();
        while (!quit) {
            System.out.println("Choose your option");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Main menu.");
        System.out.println("0. Quit application");
        System.out.println("1. Show contact list");
        System.out.println("2. Add a new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove a contact");
        System.out.println("5. Search for a contact");
    }

    public static void showContacts() {
        contact.showContacts();
    }

    public static void addContact() {
        System.out.println("Enter a name for a new contact");
        String name = scanner.nextLine();
        contact.addContact(name);
    }

    public static void modifyContact() {
        System.out.println("Enter a name to edit");
        String oldName = scanner.nextLine();
        System.out.println("Enter a new name");
        String newName = scanner.nextLine();
        contact.modifyContact(oldName, newName);
    }

    public static void removeContact() {
        System.out.println("Enter a name to remove from the contact book");
        String name = scanner.nextLine();
        contact.removeContact(name);
    }

    public static void queryContact() {
        System.out.println("Enter a name to search in the contact book");
        String name = scanner.nextLine();
        contact.onContactList(name);
        if (contact.onContactList(name)) {
            System.out.println("Found " + name);
        } else {
            System.out.println(name + " not in the contact book");
        }
    }
}
