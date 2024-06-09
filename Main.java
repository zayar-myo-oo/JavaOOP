import Bank.BankAccount;

public class Main {

    public static void main(String[] args) {
        BankAccount zayar = new BankAccount(1000);
        zayar.deposit(500);
        zayar.withdraw(1500);
        zayar.withdraw(1500);


    }
}
