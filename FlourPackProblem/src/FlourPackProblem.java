public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1, 3, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigPackWeight = 5;
        int smallPackWeight = 1;

        if (bigCount < 0 || smallCount < 0 || goal < 0 ||
                (bigCount * bigPackWeight) + (smallCount * smallPackWeight) < goal) {
            return false;
        }
        return smallCount >= goal % bigPackWeight;
    }
}
