public class EvenDigitSum {
    public static void main(String[] args) {

    }

    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number != 0) {
            int num = number % 10;
            if (number % 2 == 0) {
                sum += num;
            }
            number /= 10;
        } return sum;
    }
}
