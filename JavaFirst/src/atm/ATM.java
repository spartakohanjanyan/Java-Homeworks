package atm;

public class ATM {

    private String state;
    private int wrongPinCounter;
    private final String correctPin;

    public ATM() {
        state = "IDLE";
        wrongPinCounter = 0;
        correctPin = "1234";
    }


    public String validateAmount(int amount) {

        if (amount < 100) {
            return "TOO_LOW";
        }

        if (amount > 20000) {
            return "TOO_HIGH";
        }

        if (amount % 100 != 0) {
            return "NOT_MULTIPLE_OF_100";
        }

        return "VALID";
    }


    public void insertCard() {

        if (state.equals("IDLE")) {
            state = "CARD_INSERTED";
        } else {
            System.out.println("Invalid transition.");
        }

    }

    public void enterPin(String pin) {

        if (!state.equals("CARD_INSERTED") &&
                !state.equals("PIN_VERIFICATION")) {

            System.out.println("Invalid transition.");
            return;
        }

        if (pin.equals(correctPin)) {

            wrongPinCounter = 0;
            state = "AUTHENTICATED";

        } else {

            wrongPinCounter++;

            if (wrongPinCounter >= 3) {

                state = "BLOCKED";

            } else {

                state = "PIN_VERIFICATION";

            }

        }

    }

    public void startTransaction() {

        if (state.equals("AUTHENTICATED")) {

            state = "TRANSACTION_IN_PROGRESS";

        } else {

            System.out.println("Invalid transition.");

        }

    }

    public void completeTransaction() {

        if (state.equals("TRANSACTION_IN_PROGRESS")) {

            state = "AUTHENTICATED";

        } else {

            System.out.println("Invalid transition.");

        }

    }

    public void ejectCard() {

        if (state.equals("AUTHENTICATED")
                || state.equals("CARD_INSERTED")
                || state.equals("BLOCKED")) {

            state = "CARD_EJECTED";

        } else {

            System.out.println("Invalid transition.");

        }

    }

    public void reset() {

        if (state.equals("CARD_EJECTED")) {

            state = "IDLE";

        } else {

            System.out.println("Invalid transition.");

        }

    }

    public String getState() {
        return state;
    }


    public String approveWithdrawal(Account account, int amount) {

        if (!account.isActive()) {
            return "DENIED_ACCOUNT_BLOCKED";
        }

        if (!validateAmount(amount).equals("VALID")) {
            return "DENIED_INVALID_AMOUNT";
        }

        if (account.getBalance() < amount) {
            return "DENIED_INSUFFICIENT_BALANCE";
        }

        if (amount > account.getDailyLimitRemaining()) {
            return "DENIED_LIMIT_EXCEEDED";
        }

        return "APPROVED";

    }

}
