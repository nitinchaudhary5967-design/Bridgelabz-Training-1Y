import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take the input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initialize maxFactor, factors array, and index
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // c. Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // If array is full, expand it
                if (index == maxFactor) {

                    // d. Double the size of the array
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    // Copy old factors into temp
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    // Assign factors to temp
                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        // e. Display the factors
        System.out.println("\nFactors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
