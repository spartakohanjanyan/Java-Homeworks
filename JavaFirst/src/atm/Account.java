package atm;

public class Account {

    private boolean active;
    private int balance;
    private int dailyLimitRemaining;

    public Account(boolean active, int balance, int dailyLimitRemaining) {
        this.active = active;
        this.balance = balance;
        this.dailyLimitRemaining = dailyLimitRemaining;
    }

    public boolean isActive() {
        return active;
    }

    public int getBalance() {
        return balance;
    }

    public int getDailyLimitRemaining() {
        return dailyLimitRemaining;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDailyLimitRemaining(int dailyLimitRemaining) {
        this.dailyLimitRemaining = dailyLimitRemaining;
    }
}
