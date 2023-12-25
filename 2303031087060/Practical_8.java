import java.util.Scanner;

public class Practical_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for initial investment amount
        System.out.print("Enter the initial investment amount: ");
        double initialInvestment = input.nextDouble();

        // Ask user for interest rate
        System.out.print("Enter the interest rate: ");
        double interestRate = input.nextDouble();

        // Ask user for number of years
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        // Calculate total amount of interest earned
        double totalInterest = initialInvestment * Math.pow(1 + (interestRate / 100), years) - initialInvestment;

        // Print out the total amount of interest earned
        System.out.printf("Total amount of interest earned: $%.2f", totalInterest);

        input.close();
    }
}
