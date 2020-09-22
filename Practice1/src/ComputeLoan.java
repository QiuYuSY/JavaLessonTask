import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual interest rate,e.g.,7.25%: ");
        double annualInterestRate = scanner.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years as an integer,e.g.,5: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter loan amout,e.g.,120000.95: ");
        double loanAmount = scanner.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate /(1
        -1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100 )/ 100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100)/100.0);
    }
}
