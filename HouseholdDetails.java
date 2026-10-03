public class HouseholdDetails {
    public static void main(String[] args) {
        // Variable declarations with appropriate data types
        int familyMembers = 4;
        double waterConsumedLitres = 450.75;
        int houseNumber = 102;
        char usageStatus = 'N'; // e.g., 'N' for Normal, 'E' for Excessive

        // Displaying the details
        System.out.println("--- Household Water-Usage Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumedLitres + " litres");
        System.out.println("Water Usage Status: " + usageStatus);
    }
}
