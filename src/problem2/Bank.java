package problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add a new customer if not already in list
    public void addCustomer(String customerName, double initialTransaction) {
        if (findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName, initialTransaction);
            customers.add(newCustomer);
            System.out.println("New customer added: " + customerName + " with initial transaction " + initialTransaction);
        } else {
            System.out.println("Customer " + customerName + " already exists.");
        }
    }

    // Add a transaction to an existing customer
    public void addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println("Added transaction " + amount + " for customer " + customerName);
        } else {
            System.out.println("Customer " + customerName + " not found.");
        }
    }

    // Print all customers and their transactions
    public void printStatements() {
        System.out.println("\nBank Statement for " + name);
        System.out.println("----------------------------------");

        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName());
            System.out.println("Transactions:");

            // Unboxing Double to double
            for (Double transaction : customer.getTransactions()) {
                double amount = transaction; // unboxing
                System.out.printf("   %.2f\n", amount);
            }
            System.out.println();
        }
    }

    // Helper method to find a customer by name
    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
