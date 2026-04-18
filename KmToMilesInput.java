import java.util.Scanner;

class KmToMilesInput {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create variable and take input
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();

        // Conversion
        double miles = km / 1.6;

        // Display result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}