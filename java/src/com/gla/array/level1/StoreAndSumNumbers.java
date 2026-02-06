import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Array of 10 double elements, total initialized to 0.0, index initialized to 0
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // c. Break if user enters 0 or negative number
            if (input <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            // e. Store value in array and increment index
            numbers[index] = input;
            index++;
        }

        // f. Add values of array elements to total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        // g. Display the total value
        System.out.println("\nSum of all numbers: " + total);

        sc.close();
    }
}
