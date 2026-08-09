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
            System.out.println("Card not accepted: ATM is not in IDLE state (state=" + state + ")");
            return false;
        }
        this.insertedCard = card;
        this.wrongPinAttempts = 0;
        this.state = SessionState.CARD_INSERTED;
        System.out.println("Card accepted (" + card.getCardNumber() + ")");
        return true;
    }

    public boolean enterPin(String pin) {
        if (state != SessionState.CARD_INSERTED && state != SessionState.PIN_VERIFICATION) {
            System.out.println("PIN not accepted: this action is not allowed from state=" + state);
            return false;
        }
        if (insertedCard.verifyPin(pin)) {
            wrongPinAttempts = 0;
            state = SessionState.AUTHENTICATED;
            System.out.println("PIN correct: session is now AUTHENTICATED");
            return true;
        }
        wrongPinAttempts++;
        if (wrongPinAttempts == MAX_PIN_ATTEMPTS) {
            state = SessionState.BLOCKED;
            System.out.println("PIN incorrect (attempt " + wrongPinAttempts + "). Card is now BLOCKED");
        } else {
            state = SessionState.PIN_VERIFICATION;
            System.out.println("PIN incorrect (attempt " + wrongPinAttempts + " / " + MAX_PIN_ATTEMPTS + "). Try again");
        }
        return true;
    }

    public boolean startTransaction() {
        if (state != SessionState.AUTHENTICATED) {
            System.out.println("Transaction not started: session is not AUTHENTICATED (state=" + state + ")");
            return false;
        }
        state = SessionState.TRANSACTION_IN_PROGRESS;
        System.out.println("Transaction started");
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

        switch (result) {
            case APPROVED:
                insertedCard.applyWithdrawal(amount);
                System.out.println(amount + " was withdrawn successfully. New balance: " + insertedCard.getBalance());
                break;
            case DENIED_ACCOUNT_BLOCKED:
                System.out.println("Withdrawal denied: account is BLOCKED");
                break;
            case DENIED_INVALID_AMOUNT:
                System.out.println("Withdrawal denied: invalid amount (" + classification + ")");
                break;
            case DENIED_INSUFFICIENT_BALANCE:
                System.out.println("Withdrawal denied: insufficient balance (balance=" + insertedCard.getBalance() + ", requested=" + amount + ")");
                break;
            case DENIED_LIMIT_EXCEEDED:
                System.out.println("Withdrawal denied: daily limit exceeded (remaining=" + insertedCard.getDailyRemainingLimit(WithdrawalPolicy.DAILY_LIMIT) + ")");
                break;
        }
        return result;
    }

    public boolean completeTransaction() {
        if (state != SessionState.TRANSACTION_IN_PROGRESS) {
            System.out.println("Transaction not completed: no transaction in progress (state=" + state + ")");
            return false;
        }
        state = SessionState.AUTHENTICATED;
        System.out.println("Transaction completed");
        return true;
    }

    public boolean ejectCard() {
        if (state != SessionState.AUTHENTICATED
                && state != SessionState.CARD_INSERTED
                && state != SessionState.BLOCKED) {
            System.out.println("Card not ejected: not allowed from state=" + state);
            return false;
        }
        state = SessionState.CARD_EJECTED;
        System.out.println("Card ejected");
        return true;
    }

    public Card takeCard() {
        if (state != SessionState.CARD_EJECTED) {
            throw new IllegalStateException("Card can only be taken after being ejected, current state: " + state);
        }
        Card card = insertedCard;
        insertedCard = null;
        System.out.println("Card taken back (" + card.getCardNumber() + ")");
        return card;
    }

    public boolean reset() {
        if (state != SessionState.CARD_EJECTED) {
            System.out.println("Reset failed: card has not been ejected yet (state=" + state + ")");
            return false;
        }
        state = SessionState.IDLE;
        System.out.println("ATM reset back to IDLE");
        return true;
    }
}