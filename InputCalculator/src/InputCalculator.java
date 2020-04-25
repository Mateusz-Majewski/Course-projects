import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                break;
            }
            scanner.nextLine();
        }
        average = Math.round((double) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
