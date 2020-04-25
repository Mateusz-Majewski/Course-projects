public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1025));
    }
    public static int sumDigits(int number){
        int num = 0;
        int count = 0;
        if(number < 10){
            return -1;
        }
        while(true){
            num = number % 10;
            number = number / 10;
            count += num;
            if(number < 1){
                break;
            }
        }
        return count;
    }
}