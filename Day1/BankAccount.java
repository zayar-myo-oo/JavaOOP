package Day1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + initialBalance);
        displayCurrentBalance();
    } //constructor

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
        displayCurrentBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            displayCurrentBalance();
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayCurrentBalance() {
        System.out.println("Current balance: " + balance);
    }
}
