public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        int currentRow = 0;
        int currentColumn = 0;
        if (number >= 5) {
            for (currentRow = 1; currentRow <= number; currentRow++) {
                for (currentColumn = 1; currentColumn <= number; currentColumn++) {
                    if (currentRow == 1 || currentColumn == 1 || currentRow == currentColumn || currentRow == number || currentColumn == number || currentColumn == number - currentRow + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
