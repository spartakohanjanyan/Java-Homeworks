package atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {

            System.out.println("\n========== ATM TEST MENU ==========");
            System.out.println("1. Validate Withdrawal Amount");
            System.out.println("2. Insert Card");
            System.out.println("3. Enter PIN");
            System.out.println("4. Start Transaction");
            System.out.println("5. Complete Transaction");
            System.out.println("6. Eject Card");
            System.out.println("7. Reset ATM");
            System.out.println("8. Check Current State");
            System.out.println("9. Test Withdrawal Approval");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter withdrawal amount: ");
                    int amount = scanner.nextInt();

                    System.out.println("Result: " + atm.validateAmount(amount));
                    break;

                case 2:

                    atm.insertCard();
                    System.out.println("Current State: " + atm.getState());
                    break;

                case 3:

                    System.out.print("Enter PIN: ");
                    String pin = scanner.next();

                    atm.enterPin(pin);

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 4:

                    atm.startTransaction();

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 5:

                    atm.completeTransaction();

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 6:

                    atm.ejectCard();

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 7:

                    atm.reset();

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 8:

                    System.out.println("Current State: " + atm.getState());
                    break;

                case 9:

                    System.out.print("Is account active? (true/false): ");
                    boolean active = scanner.nextBoolean();

                    System.out.print("Account balance: ");
                    int balance = scanner.nextInt();

                    System.out.print("Daily remaining limit: ");
                    int limit = scanner.nextInt();

                    System.out.print("Withdrawal amount: ");
                    int withdrawal = scanner.nextInt();

                    Account account = new Account(active, balance, limit);

                    System.out.println("Result: "
                            + atm.approveWithdrawal(account, withdrawal));

                    break;

                case 0:

                    System.out.println("Program finished.");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid option.");

            }

        }

    }

}