package majewski.mateusz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private static ArrayList<Album> albumArrayList = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Test");
        album.addNewSong("Test song 1", 5.2);
        album.addNewSong("Test song 2", 6.2);
        albumArrayList.add(album);

        Album album1 = new Album("Test album 2");
        album1.addNewSong("Test the only song", 3.2);
        albumArrayList.add(album1);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albumArrayList.get(0).addToPlaylist(playlist, "Test song 1");
        albumArrayList.get(0).addToPlaylist(playlist, "Test song 2");

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Stopping playback...");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("======================================");
        System.out.println("Choose an option");
        System.out.println("0 - to quit");
        System.out.println("1 - next song");
        System.out.println("2 - previous song");
        System.out.println("3 - show playlist");
        System.out.println("4 - to show menu");
        System.out.println("======================================");
    }
}
