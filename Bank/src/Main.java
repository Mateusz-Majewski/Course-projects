public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount(93010123,150.0,
                "Bob Waddle", "test@gmail.com", 123_123_123);

//        bobsAccount.setNumber(93010123);
//        bobsAccount.setBalance(150.0);
//        bobsAccount.setCustomerName("Bob Waddle");
//        bobsAccount.setEmail("test@gmail.com");
//        bobsAccount.setPhoneNumber(123_123_123);

        bobsAccount.withdraw(100);
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);
        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);
    }
}
