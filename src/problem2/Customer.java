package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }
    // Add a new transaction (credit or debit)
    public void addTransaction(double amount) {
        transactions.add(amount);
    }
    // Get customer's name
    public String getName() {
        return name;
    }
    // Get all transactions
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

