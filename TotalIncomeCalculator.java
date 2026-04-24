import java.util.Scanner;

// Class to calculate total income
class TotalIncomeCalculator {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take salary input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();

        // Take bonus input
        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display result
        System.out.println("The salary is INR " + salary +
                           " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + totalIncome);
    }
}