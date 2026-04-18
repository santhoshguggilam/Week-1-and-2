class DiscountCalculation {
    public static void main(String[] args) {

        // Create variables
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        // Display result
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}