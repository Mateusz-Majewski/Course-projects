public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(int number, double balance, String customerName, String email, int phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return this.number;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("The deposit of " + amount + " was made. New balance is " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("The withdrawal of " + amount + " is not possible. Only " + this.balance + " available.");
        } else {
            this.balance -= amount;
            System.out.println("The withdrawal of " + amount + " processed. Remaining balance " + this.balance);
        }
    }
}
