public class Switch {
    public static void main(String[] args) {
        int switchValue = 3;

//        switch (switchValue) {
//            case 1:
//                System.out.println("The value is 1");
//                break;
//            case 2:
//                System.out.println("The value is 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("The value is 3, or 4, or 5");
//                System.out.println("Actually the value is " + switchValue);
//                break;
//            default:
//                System.out.println("The value is not 1, 2, 3, 4 or 5");
//                break;
//        }

        char switchCharValue = 'A';

        switch (switchCharValue) {
            case 'A':
                System.out.println("The value is A");
                break;
            case 'B':
                System.out.println("The value is B");
                break;
            case 'C':
                System.out.println("The value is C");
                break;
            case 'D':
                System.out.println("The value is D");
                break;
            case 'E':
                System.out.println("The value is E");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
