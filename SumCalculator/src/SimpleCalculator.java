public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtractionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        if (this.getSecondNumber() != 0) {
            return getFirstNumber() / getSecondNumber();
        } else {
            return 0;
        }
    }
}
