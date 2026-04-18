class VolumeOfEarth {
    public static void main(String[] args) {

        // Create variables
        double radiusKm = 6378;
        double pi = Math.PI;

        // Calculate volume in km^3
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km to miles
        double kmToMilesFactor = 1.6;
        double radiusMiles = radiusKm / kmToMilesFactor;

        // Calculate volume in miles^3
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}