package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
	    Account mattAccount = new Account("Matt");
	    mattAccount.deposit(1000);
	    mattAccount.withdraw(500);
	    mattAccount.withdraw(-200);
	    mattAccount.deposit(-20);
	    mattAccount.calculateBalance();

        System.out.println("Balance on account is " + mattAccount.getBalance());
    }
}
