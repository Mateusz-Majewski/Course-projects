package majewski.mateusz;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transactionAmount);
        }
        return false;
    }

    public boolean showCustomers(String branchName, boolean showTransaction) {
            Branch branch = findBranch(branchName);
            if(branch != null) {
                System.out.println("Customer details for branch " + branch.getName());
                ArrayList<Customer> branchCustomers = branch.getCustomers();
                for(int i = 0; i < branchCustomers.size(); i++) {
                    Customer branchCustomer = branchCustomers.get(i);
                    System.out.println("Customer: " +  branchCustomer.getName() + "[" + (i+1) + "]");
                    if(showTransaction) {
                        System.out.println("Transactions");
                        ArrayList<Double> transactions = branchCustomer.getTransactions();
                        for(int j = 0; j < transactions.size(); j++) {
                            System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                        }
                    }
                }
                    return true;
                } else {
                return false;
        }
    }
}
