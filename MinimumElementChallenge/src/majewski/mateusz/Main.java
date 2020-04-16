package majewski.mateusz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter how many numbers you would like to enter into array.");
        int[] array = readIntegers(scanner.nextInt());
        scanner.close();
        System.out.println("The array is: " + Arrays.toString(array));
        System.out.println("The minimum value of the array is: " + findMin(array));

    }


    public static int[] readIntegers(int integers) {
        int[] array = new int[integers];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter next value to put into array.");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
