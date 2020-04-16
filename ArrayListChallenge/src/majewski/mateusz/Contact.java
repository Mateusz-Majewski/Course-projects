package majewski.mateusz;

import java.util.ArrayList;

public class Contact {
    private String name;
    private int phoneNumber;
    private ArrayList<String> contacts = new ArrayList<String>();

    public void showContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + " " + contacts.get(i));
        }
    }

    public void addContact(String name) {
        contacts.add(name);
    }

    public void modifyContact(String oldName, String newName) {
        int position = queryContact(oldName);
        if (position >= 0) {
            modifyContact(position, newName);
            System.out.println(oldName + " has been modified to " + newName);
        }
    }

    private void modifyContact(int position, String newName) {
        contacts.set(position, newName);
    }

    public void removeContact(String name) {
        int position = queryContact(name);
        if (position >= 0) {
            removeContact(position);
            System.out.println(name + " has been removed from the contact book.");
        }
    }

    private void removeContact(int position) {
        contacts.remove(position);
    }

    public boolean onContactList(String searchedName) {
        int position = queryContact(searchedName);
        if (position >= 0) {
            return true;
        }
        return false;
    }

    public int queryContact(String searchedName) {
        return contacts.indexOf(searchedName);
    }


}
