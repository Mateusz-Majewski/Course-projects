package majewski.mateusz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("Sorting...");
        Arrays.sort(array);
        printArray(array);
    }

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.println("Element: " + i + ", value: " + number[i]);
        }
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] valuesOfArray = new int [number];
        for(int i = 0; i < valuesOfArray.length; i++) {
            valuesOfArray[i] = scanner.nextInt();
        }
        return valuesOfArray;
    }


}
