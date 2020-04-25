public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    public static boolean isPalindrome (int number) {
        int processedNumber = number;
        int reversedNumber = 0;
        while (processedNumber != 0) {
            int num = processedNumber % 10;
            reversedNumber += num;
            processedNumber /= 10;
            if (number == reversedNumber) {
                return true;
            }
            reversedNumber *= 10;
        }
        return false;
    }
}
