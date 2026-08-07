package atm;

public final class WithdrawalPolicy {

    public static final long MIN_AMOUNT = 100;
    public static final long MAX_AMOUNT_PER_TRANSACTION = 20000;
    public static final long DAILY_LIMIT = 50000;

    private WithdrawalPolicy() {
    }

    public static AmountClassification classify(long amount) {
        if (amount < MIN_AMOUNT) {
            return AmountClassification.TOO_LOW;
        }
        if (amount > MAX_AMOUNT_PER_TRANSACTION) {
            return AmountClassification.TOO_HIGH;
        }
        if (amount % 100 != 0) {
            return AmountClassification.NOT_MULTIPLE_OF_100;
        }
        return AmountClassification.VALID;
    }

    public static WithdrawalResult evaluate(boolean accountActive,
                                            AmountClassification amountClassification,
                                            boolean sufficientBalance,
                                            boolean withinDailyLimit) {
        if (!accountActive) {
            return WithdrawalResult.DENIED_ACCOUNT_BLOCKED;
        }
        if (amountClassification != AmountClassification.VALID) {
            return WithdrawalResult.DENIED_INVALID_AMOUNT;
        }
        if (!sufficientBalance) {
            return WithdrawalResult.DENIED_INSUFFICIENT_BALANCE;
        }
        if (!withinDailyLimit) {
            return WithdrawalResult.DENIED_LIMIT_EXCEEDED;
        }
        return WithdrawalResult.APPROVED;
    }
}