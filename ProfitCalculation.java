class ProfitCalculation {
    public static void main(String[] args) {

        // Create variables
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculate profit and percentage
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Display result
        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " + profitPercentage);
    }
}