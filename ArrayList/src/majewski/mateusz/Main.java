package majewski.mateusz;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
    	boolean quit = false;
    	int choice = 0;
    	printInstructions();
    	while(!quit) {
			System.out.println("Choose an option:");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.showGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true;
					break;
			}
		}
    }

    public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the list of grocery items");
		System.out.println("\t 2 - To add item to the grocery list");
		System.out.println("\t 3 - To modify an item on the grocery list");
		System.out.println("\t 4 - To remove an item from the grocery list");
		System.out.println("\t 5 - To search for an item on the grocery list");
		System.out.println("\t 6 - To quit the application");
	}

	public static void addItem() {
		System.out.println("Please add a new item");
    	groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.println("Please enter current product name");
		String itemName = scanner.nextLine();
		System.out.println("Please enter a name for the new product");
		String itemOld = scanner.nextLine();
    	groceryList.modifyGroceryItem(itemName, itemOld);
	}

	public static void removeItem() {
		System.out.println("Please enter name of a product to remvoe from the grocery list");
		String itemName= scanner.nextLine();
    	groceryList.removeGroceryItem(itemName);
	}

	public static void searchForItem() {
		System.out.println("Please enter a product name to search for it on the grocery list");
		String searchItem = scanner.nextLine();
		if(groceryList.onGroceryList(searchItem)) {
			System.out.println("Found " + searchItem);
		} else {
			System.out.println(searchItem + " not on the grocery list");
		}
	}
}
