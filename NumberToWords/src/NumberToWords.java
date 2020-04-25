public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(12309110);
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);
        String numberInWords = "";
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.println("Zero");
        }

        while (reversedNumber != 0) {
            int num = reversedNumber % 10;
            reversedNumber /= 10;
            switch (num) {
                case 0:
                    numberInWords = numberInWords + "Zero ";
                    break;
                case 1:
                    numberInWords = numberInWords + "One ";
                    break;
                case 2:
                    numberInWords = numberInWords + "Two ";
                    break;
                case 3:
                    numberInWords = numberInWords + "Three ";
                    break;
                case 4:
                    numberInWords = numberInWords + "Four ";
                    break;
                case 5:
                    numberInWords = numberInWords + "Five ";
                    break;
                case 6:
                    numberInWords = numberInWords + "Six ";
                    break;
                case 7:
                    numberInWords = numberInWords + "Seven ";
                    break;
                case 8:
                    numberInWords = numberInWords + "Eight ";
                    break;
                case 9:
                    numberInWords = numberInWords + "Nine ";
                    break;
                default:
                    break;
            }
        }
        System.out.printf(numberInWords);
        if (getDigitCount(reverse(number)) != getDigitCount(number)) {
            for (int i = getDigitCount(reverse(number)); i < getDigitCount(number); i++) {
                System.out.printf("Zero ");
            }
        }
    }

    public static int reverse(int number) {
        int newNumber = 0;
        int calculatedNumber = number;
        int num = 0;
        while (calculatedNumber != 0) {
            num = calculatedNumber % 10;
            calculatedNumber /= 10;
            newNumber += num;
            if (calculatedNumber == 0) {
                break;
            }
            newNumber *= 10;
        }
        return newNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int i = 0;
        while (number != 0) {
            number /= 10;
            i++;
        }
        return i;
    }
}
