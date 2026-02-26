package homework21226;

public class SalaryTax {
    public static void main(String[] args){

                calculateIncomeTax(120000);
                calculateIncomeTax(300000);
                calculateIncomeTax(600000);
            }

            public static void calculateIncomeTax(int salary) {
                int totalTax = 0;

                if (salary <= 150000) {
                    totalTax += calculateTax(salary);
                } else if (salary <= 500000) {
                    totalTax += calculateTax(150000);
                    totalTax += calculateTax(salary - 150000, 20);
                } else {
                    totalTax += calculateTax(150000);
                    totalTax += calculateTax(350000, 20);
                    totalTax += calculateTax(salary - 500000, 300.0);
                }

                System.out.println("Salary: " + salary + "Tax: " + totalTax + " dram");
            }

            public static int calculateTax(int amount) {
                return (int) (amount * 0.15);
            }

            public static int calculateTax(int amount, int percent) {
                return (int) (amount * percent / 100.0);
            }

            public static int calculateTax(int amount, double perThousandTax) {
                return (int) (( amount / 1000.0) * perThousandTax);
            }
        }

