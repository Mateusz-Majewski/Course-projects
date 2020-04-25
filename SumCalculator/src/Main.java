public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(10);
        System.out.println(calculator.getAdditionResult());
        System.out.println(calculator.getDivisionResult());
        System.out.println(calculator.getMultiplicationResult());
        System.out.println(calculator.getSubtractionResult());
    }
}
