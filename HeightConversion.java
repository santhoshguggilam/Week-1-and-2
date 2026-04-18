import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input
        double heightCm;
        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Convert to feet and inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println("Your Height in cm is " + heightCm +
                           " while in feet is " + feet +
                           " and inches is " + inches);

        input.close();
    }
}