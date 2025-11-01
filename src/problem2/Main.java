package problem2;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("OpenAI Community Bank");

        bank.addCustomer("Alice", 150.0);
        bank.addCustomer("Bob", 200.0);
        bank.addCustomer("Alice", 300.0); // should print that customer already exists

        bank.addCustomerTransaction("Alice", -50.0);
        bank.addCustomerTransaction("Alice", 75.25);
        bank.addCustomerTransaction("Bob", -20.0);
        bank.addCustomerTransaction("Charlie", 100.0); // customer not found

        bank.printStatements();
    }
}
