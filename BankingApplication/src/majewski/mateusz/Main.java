package majewski.mateusz;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.50);
        bank.addCustomer("Adelaide", "Tom", 33.20);
        bank.addCustomer("Adelaide", "Mark", 20.1);

        bank.addBranch("Sydney");

        bank.addCustomer("Sydney", "Adam", 5.20);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 22.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 13.52);

        bank.showCustomers("Adelaide", true);
        bank.showCustomers("Sydney", true);
    }
}
