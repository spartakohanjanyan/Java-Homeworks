package homework11826;

public class BankDeposit {
    public static void main(String[] args){

        double deposit = 30000;
        double p = 12;
        int months = 0;

        while (deposit <= 100000) {
            deposit += deposit * (p / 100);
            months++;
        }

        System.out.println("Months : " + months);
        System.out.println("Final money : " + deposit );

    }
}
