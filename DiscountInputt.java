import java.util.Scanner;

class DiscountInputt {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs
        double fee;
        double discountPercent;

        System.out.print("Enter fee: ");
        fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        discountPercent = input.nextDouble();

        // Calculate
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}