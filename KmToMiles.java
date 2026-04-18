class KmToMiles {
    public static void main(String[] args) {

        // Create variables
        double distanceKm = 10.8;
        double kmToMilesFactor = 1.6;

        // Convert
        double distanceMiles = distanceKm / kmToMilesFactor;

        // Display result
        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}