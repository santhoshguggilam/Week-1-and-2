import java.util.Scanner;

// Class to calculate purchase price
class PurchaseCalculation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        double unitPrice;
        int quantity;

        System.out.print("Enter unit price: ");
        unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();

        // Calculate total
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}