package homeworkownexception;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
