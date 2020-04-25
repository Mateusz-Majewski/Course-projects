public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1,1,2));
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree){
        if ((isValid(numberOne) == false) || (isValid(numberTwo) == false) || (isValid(numberThree) == false)) {
            return false;
        }
        int numOne = numberOne % 10;
        int numTwo = numberTwo % 10;
        int numThree = numberThree % 10;
        if (numOne == numTwo || numOne == numThree || numTwo == numThree){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
