package majewski.mateusz;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
        private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void showGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        System.out.println("The list is:");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onGroceryList(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        } return false;
    }

    private int findItem(String searchedItem) {
        return groceryList.indexOf(searchedItem);
    }
}
