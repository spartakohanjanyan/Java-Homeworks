package atm;

public enum SessionState {
    IDLE,
    CARD_INSERTED,
    PIN_VERIFICATION,
    AUTHENTICATED,
    TRANSACTION_IN_PROGRESS,
    BLOCKED,
    CARD_EJECTED
}