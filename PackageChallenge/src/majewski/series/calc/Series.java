package majewski.series.calc;

public class Series {

    public int nSum(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int factorial(int num) {
        if(num == 0) {
            return 0;
        } else {
            int total = 1;
            for (int i = 1; i <= num; i++) {
                total *= i;
            }
            return total;
        }
    }

    public int fibonacci(int num) {
        int n1 = 0;
        int n2 = 1;
        int total = 0;
        for (int i = 2; i <= num; i++) {
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
        return total;
    }
}
