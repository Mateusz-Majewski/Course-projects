import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasNextInt =scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid output. Try again.");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of your numbers is: " + sum);
        scanner.close();
    }
}
