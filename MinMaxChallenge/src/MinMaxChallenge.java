import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean firstIteration = true;
        while (true){
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt){
                break;
            }
            int number = scanner.nextInt();
            if (firstIteration) {
                max = number;
                min = number;
                firstIteration = false;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            scanner.nextLine();
        }
        System.out.println("The minimum number you entered is: " + min);
        System.out.println("The maximum number you entered is: " + max);
    }
}
