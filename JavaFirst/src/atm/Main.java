package atm;

public class Main {

    public static void main(String[] args) {
        Card card = new Card("1111222233334444", "1111", 5000);
        ATMMachine atm = new ATMMachine();

        atm.insertCard(card);
        atm.enterPin("0000");
        atm.enterPin("1115");
        atm.enterPin("1111");
        atm.startTransaction();
        atm.withdraw(6000);
        atm.withdraw(300);
        atm.completeTransaction();
        atm.ejectCard();
        atm.takeCard();
        atm.reset();
    }
}