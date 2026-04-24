package homeworkownexception;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            double shortage = amount - balance;
            throw new InsufficientFundsException(shortage);
        }

        balance -= amount;
        System.out.println("Withdrawn " + amount);
        System.out.println("Balance " + balance);
    }
}
