import java.util.Scanner;

// Class to calculate area of triangle
class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input values
        double baseCm, heightCm;
        System.out.print("Enter base in cm: ");
        baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        heightCm = input.nextDouble();

        // Area in sq cm
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert to inches
        double cmPerInch = 2.54;
        double baseInch = baseCm / cmPerInch;
        double heightInch = heightCm / cmPerInch;

        double areaSqInch = 0.5 * baseInch * heightInch;

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqInch +
                           " and sq cm is " + areaSqCm);

        input.close();
    }
}