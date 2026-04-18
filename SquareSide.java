import java.util.Scanner;

// Class to calculate side of square
class SquareSide {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        double perimeter;
        System.out.print("Enter perimeter: ");
        perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        input.close();
    }
}