public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if ((numberOne >= 10 && numberOne <= 99) && (numberTwo >= 10 && numberTwo <= 99)){
                int numOneFirst = numberOne % 10;
                int numTwoFirst = numberTwo % 10;
                numberOne /= 10;
                numberTwo /= 10;
                int numOneSecond = numberOne % 10;
                int numTwoSecond = numberTwo % 10;
                if (numOneFirst == numTwoFirst || numOneSecond == numTwoSecond || numOneFirst == numTwoSecond || numOneSecond == numTwoFirst) {
                    return true;
                }
        }
        return false;
    }
}
