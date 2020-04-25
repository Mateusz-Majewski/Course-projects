public class DigitSumChallenge {
    public static void main(String[] args) {
        sumDigits(1);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int num = number % 10;
            sum += num;
            number /= 10;
        }
        System.out.println("The sum is: " + sum);
        return sum;
    }
}
