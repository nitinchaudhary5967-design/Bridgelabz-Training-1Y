import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert number to positive if negative
        if (number < 0) {
            number = -number;
        }

        // b. Find the count of digits in the number
        long temp = number;
        int digitCount = 0;

        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        // c. Store digits in an array
        int[] digits = new int[digitCount];
        temp = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // d. Find frequency of each digit
        int[] frequency = new int[10]; // 0-9 digits

        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // e. Display the frequency of each digit
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + frequency[i]);
        }

        sc.close();
    }
}
