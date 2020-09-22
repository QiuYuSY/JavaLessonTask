import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sale tax is $" + (int)(tax * 100) / 100.0);
    }
}
