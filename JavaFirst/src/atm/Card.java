package atm;

import java.time.LocalDate;


public class Card {

    private static final int CARD_NUMBER_LENGTH = 16;
    private static final int PIN_LENGTH = 4;

    private final String cardNumber;
    private final String pin;
    private long balance;
    private AccountStatus status;

    private long dailyWithdrawnAmount;
    private LocalDate dailyWithdrawnDate;

    public Card(String cardNumber, String pin, long initialBalance) {
        if (!isAllDigitsOfLength(cardNumber, CARD_NUMBER_LENGTH)) {
            throw new IllegalArgumentException("Card number must be exactly 16 digits: " + cardNumber);
        }
        if (!isAllDigitsOfLength(pin, PIN_LENGTH)) {
            throw new IllegalArgumentException("PIN must be exactly 4 digits: " + pin);
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative: " + initialBalance);
        }
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = initialBalance;
        this.status = AccountStatus.ACTIVE;
        this.dailyWithdrawnAmount = 0L;
        this.dailyWithdrawnDate = null;
    }


    private static boolean isAllDigitsOfLength(String value, int expectedLength) {
        if (value == null || value.length() != expectedLength) {
            return false;
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean verifyPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public long getBalance() {
        return balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public long getDailyRemainingLimit(long dailyLimit) {
        resetDailyCounterIfNewDay();
        return dailyLimit - dailyWithdrawnAmount;
    }

    public long getDailyWithdrawnAmount() {
        resetDailyCounterIfNewDay();
        return dailyWithdrawnAmount;
    }

    private void resetDailyCounterIfNewDay() {
        LocalDate today = LocalDate.now();
        if (dailyWithdrawnDate == null || !dailyWithdrawnDate.equals(today)) {
            dailyWithdrawnAmount = 0L;
            dailyWithdrawnDate = today;
        }
    }

    void applyWithdrawal(long amount) {
        resetDailyCounterIfNewDay();
        balance -= amount;
        dailyWithdrawnAmount += amount;
    }

    @Override
    public String toString() {
        return "Card{" + cardNumber + ", balance=" + balance + ", status=" + status + "}";
    }
}