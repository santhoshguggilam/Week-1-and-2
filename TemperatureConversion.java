import java.util.Scanner;

// Class to convert temperature from Fahrenheit to Celsius
class TemperatureConversion {
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Create variable fahrenheit and take user input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
    }
}