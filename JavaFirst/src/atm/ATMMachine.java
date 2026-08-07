package atm;

public class ATMMachine {

    private static final int MAX_PIN_ATTEMPTS = 3;

    private SessionState state;
    private Card insertedCard;
    private int wrongPinAttempts;

    public ATMMachine() {
        this.state = SessionState.IDLE;
        this.insertedCard = null;
        this.wrongPinAttempts = 0;
    }

    public SessionState getState() {
        return state;
    }

    public Card getInsertedCard() {
        return insertedCard;
    }

    public boolean insertCard(Card card) {
        if (state != SessionState.IDLE) {
            return false;
        }
        this.insertedCard = card;
        this.wrongPinAttempts = 0;
        this.state = SessionState.CARD_INSERTED;
        return true;
    }

    public boolean enterPin(String pin) {
        if (state != SessionState.CARD_INSERTED && state != SessionState.PIN_VERIFICATION) {
            return false;
        }
        if (insertedCard.verifyPin(pin)) {
            wrongPinAttempts = 0;
            state = SessionState.AUTHENTICATED;
            return true;
        }
        wrongPinAttempts++;
        state = (wrongPinAttempts >= MAX_PIN_ATTEMPTS) ? SessionState.BLOCKED : SessionState.PIN_VERIFICATION;
        return true;
    }

    public boolean startTransaction() {
        if (state != SessionState.AUTHENTICATED) {
            return false;
        }
        state = SessionState.TRANSACTION_IN_PROGRESS;
        return true;
    }

    public WithdrawalResult withdraw(long amount) {
        if (state != SessionState.TRANSACTION_IN_PROGRESS) {
            throw new IllegalStateException(
                    "Withdrawal only allowed during TRANSACTION_IN_PROGRESS, current state: " + state);
        }

        AmountClassification classification = WithdrawalPolicy.classify(amount);
        boolean accountActive = insertedCard.getStatus() == AccountStatus.ACTIVE;
        boolean sufficientBalance = insertedCard.getBalance() >= amount;
        boolean withinDailyLimit = insertedCard.getDailyRemainingLimit(WithdrawalPolicy.DAILY_LIMIT) >= amount;

        WithdrawalResult result = WithdrawalPolicy.evaluate(accountActive, classification, sufficientBalance, withinDailyLimit);
        if (result == WithdrawalResult.APPROVED) {
            insertedCard.applyWithdrawal(amount);
        }
        return result;
    }

    public boolean completeTransaction() {
        if (state != SessionState.TRANSACTION_IN_PROGRESS) {
            return false;
        }
        state = SessionState.AUTHENTICATED;
        return true;
    }

    public boolean ejectCard() {
        if (state != SessionState.AUTHENTICATED
                && state != SessionState.CARD_INSERTED
                && state != SessionState.BLOCKED) {
            return false;
        }
        state = SessionState.CARD_EJECTED;
        return true;
    }

    public Card takeCard() {
        if (state != SessionState.CARD_EJECTED) {
            throw new IllegalStateException("Card can only be taken after being ejected, current state: " + state);
        }
        Card card = insertedCard;
        insertedCard = null;
        return card;
    }

    public boolean reset() {
        if (state != SessionState.CARD_EJECTED) {
            return false;
        }
        state = SessionState.IDLE;
        return true;
    }
}