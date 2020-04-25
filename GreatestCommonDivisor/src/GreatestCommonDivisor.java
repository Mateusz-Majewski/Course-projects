public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        if (first > second) {
            for (int i = first; i >= 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            } return -1;
        }
        if (second > first) {
            for (int i = second; i >= 1; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            } return -1;
        }
        return -1;
    }
}