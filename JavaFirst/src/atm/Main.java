package atm;

public class Main {

    public static void main(String[] args) {
        scenarioHappyPath();
        scenarioWrongPinBlocksSession();
        scenarioAmountClassifications();
        scenarioDecisionTableDenials();
        scenarioInvalidTransitions();
        scenarioEjectWithoutTransacting();
    }

    private static void scenarioHappyPath() {
        System.out.println("== Scenario 1: happy path (insert -> correct PIN -> withdraw -> eject) ==");
        Card card = new Card("1234567812345678", "1111", 5000);
        ATMMachine atm = new ATMMachine();

        System.out.println("insertCard: " + atm.insertCard(card) + " -> " + atm.getState());
        System.out.println("enterPin (correct): " + atm.enterPin("1111") + " -> " + atm.getState());
        System.out.println("startTransaction: " + atm.startTransaction() + " -> " + atm.getState());
        System.out.println("withdraw(300): " + atm.withdraw(300) + ", balance now = " + card.getBalance());
        System.out.println("completeTransaction: " + atm.completeTransaction() + " -> " + atm.getState());
        System.out.println("ejectCard: " + atm.ejectCard() + " -> " + atm.getState());
        System.out.println("reset: " + atm.reset() + " -> " + atm.getState());
        System.out.println();
    }

    private static void scenarioWrongPinBlocksSession() {
        System.out.println("== Scenario 2: three wrong PINs -> BLOCKED ==");
        Card card = new Card("1234567812345679", "2222", 1000);
        ATMMachine atm = new ATMMachine();

        atm.insertCard(card);
        System.out.println("enterPin (wrong #1): " + atm.enterPin("0000") + " -> " + atm.getState());
        System.out.println("enterPin (wrong #2): " + atm.enterPin("0001") + " -> " + atm.getState());
        System.out.println("enterPin (wrong #3): " + atm.enterPin("0002") + " -> " + atm.getState());
        System.out.println("ejectCard from BLOCKED: " + atm.ejectCard() + " -> " + atm.getState());
        System.out.println();
    }

    private static void scenarioAmountClassifications() {
        System.out.println("== Scenario 3: amount classification (Part 1) ==");
        long[] amounts = {50, 100, 20000, 20100, 250};
        for (long amount : amounts) {
            System.out.println("classify(" + amount + ") = " + WithdrawalPolicy.classify(amount));
        }
        System.out.println();
    }

    private static void scenarioDecisionTableDenials() {
        System.out.println("== Scenario 4: withdrawal denials (Part 3) ==");

        Card blockedAccount = new Card("1111222233334444", "3333", 5000);
        blockedAccount.setStatus(AccountStatus.BLOCKED);
        ATMMachine atm1 = new ATMMachine();
        atm1.insertCard(blockedAccount);
        atm1.enterPin("3333");
        atm1.startTransaction();
        System.out.println("Blocked account withdraw(300): " + atm1.withdraw(300));

        Card lowBalance = new Card("1111222233334445", "4444", 200);
        ATMMachine atm2 = new ATMMachine();
        atm2.insertCard(lowBalance);
        atm2.enterPin("4444");
        atm2.startTransaction();
        System.out.println("Insufficient balance withdraw(500): " + atm2.withdraw(500));

        Card dailyLimitCard = new Card("1111222233334446", "5555", 100000);
        ATMMachine atm3 = new ATMMachine();
        atm3.insertCard(dailyLimitCard);
        atm3.enterPin("5555");
        atm3.startTransaction();
        System.out.println("First withdrawal today, withdraw(20000): " + atm3.withdraw(20000));
        atm3.completeTransaction();
        atm3.startTransaction();
        System.out.println("Second withdrawal today, withdraw(20000): " + atm3.withdraw(20000));
        atm3.completeTransaction();
        atm3.startTransaction();
        System.out.println("Third withdrawal today (over the 50000 daily limit), withdraw(20000): " + atm3.withdraw(20000));
        System.out.println();
    }

    private static void scenarioInvalidTransitions() {
        System.out.println("== Scenario 5: invalid transitions ==");
        ATMMachine atm = new ATMMachine();
        System.out.println("enterPin with no card inserted (from IDLE): " + atm.enterPin("1111") + " -> " + atm.getState());
        System.out.println("startTransaction with no card/PIN (from IDLE): " + atm.startTransaction() + " -> " + atm.getState());
        System.out.println();
    }

    private static void scenarioEjectWithoutTransacting() {
        System.out.println("== Scenario 6: insert card, then eject without ever transacting ==");
        Card card = new Card("9999888877776666", "9999", 1000);
        ATMMachine atm = new ATMMachine();
        atm.insertCard(card);
        System.out.println("ejectCard directly from CARD_INSERTED: " + atm.ejectCard() + " -> " + atm.getState());
        Card takenBack = atm.takeCard();
        System.out.println("takeCard: " + takenBack);
        System.out.println("reset: " + atm.reset() + " -> " + atm.getState());
    }
}