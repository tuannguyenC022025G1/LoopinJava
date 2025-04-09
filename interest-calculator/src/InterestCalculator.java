import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter monthly interest rate (1% is 0.01 ): ");
        double monthlyRate = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int months = scanner.nextInt();

        double total = loanAmount;

        for (int i = 0; i < months; i++) {
            total += total * monthlyRate;
        }

        System.out.printf("Total amount after %d months: %.2f\n", months, total);

        scanner.close();
    }
}
