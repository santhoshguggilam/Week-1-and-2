import java.util.Scanner;

// Class to convert distance
class DistanceConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        double distanceInFeet;
        System.out.print("Enter distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Conversion factors
        double feetPerYard = 3;
        double yardsPerMile = 1760;

        // Convert
        double distanceInYards = distanceInFeet / feetPerYard;
        double distanceInMiles = distanceInYards / yardsPerMile;

        // Output
        System.out.println("The distance in yards is " + distanceInYards +
                           " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}