import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read water consumption
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double bill;

        // Calculate bill using if-else
        if (consumption <= 500) {
            bill = 100.0;
        } else {
            bill = 200.0;
        }

        // Display the calculated bill
        System.out.println("Water Bill: Rs. " + bill);

        scanner.close();
    }
}