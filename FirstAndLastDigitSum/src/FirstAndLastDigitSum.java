public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(12345);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (number == 0) {
                sum = lastDigit + digit;
                break;
            }
        }
        return sum;
    }
}
