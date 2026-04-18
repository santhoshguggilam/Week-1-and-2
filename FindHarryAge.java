class FindHarryAge {
    public static void main(String[] args) {

        // Create variables for name, birthYear and currentYear
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display result
        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}