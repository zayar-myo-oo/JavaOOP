package Day1;

import java.util.Scanner;

public class BankAccountWithConsoleApp {
    private double balance;

    public static void main(String[] args) {
        BankAccountWithConsoleApp zayar = new BankAccountWithConsoleApp();
    }

    public BankAccountWithConsoleApp() {
        run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        this.balance = initialBalance;
        System.out.println("Account created with initial balance: " + initialBalance);
        displayCurrentBalance();
        reRunLoop(scanner);
    }

    private double getBalance() {
        return balance;
    }

    private void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
        displayCurrentBalance();
    }

    private void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
            displayCurrentBalance();
        } else {
            System.out.println("Insufficient funds");
        }
    }

    private void displayCurrentBalance() {
        System.out.println("Current balance: " + balance);
    }

    private boolean reRun(Scanner scanner) {
        System.out.println("Do you want to continue? (y/n)");
        String input = scanner.next();
        if (input.equalsIgnoreCase("y")) {
            return false;
        } else if (input.equalsIgnoreCase("n")) {
            return true;
        } else {
            System.out.println("Invalid input");
            return reRun(scanner);
        }
    }

    private void reRunLoop(Scanner scanner) {
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (reRun(scanner)) {
                break;
            }
        }
    }
}
