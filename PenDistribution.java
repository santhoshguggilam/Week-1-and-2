class PenDistribution {
    public static void main(String[] args) {

        // Create variables
        int totalPens = 14;
        int students = 3;

        // Calculate distribution
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Display result
        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}