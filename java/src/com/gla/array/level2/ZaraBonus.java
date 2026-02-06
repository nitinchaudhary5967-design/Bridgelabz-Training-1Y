import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // b. Define arrays for salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        // c. Define arrays for new salary and bonus
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // d. Input loop for 10 employees
        for (int i = 0; i < 10; i++) {

            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double years = sc.nextDouble();

            // Validation check
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter valid salary and years of service.");
                i--; // decrement index to retry this employee
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // e. Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;  // 5%
            } else {
                bonus[i] = salary[i] * 0.02;  // 2%
            }

            newSalary[i] = salary[i] + bonus[i];

            // Add to totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // f. Display results
        System.out.println("\n--- Bonus and Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
