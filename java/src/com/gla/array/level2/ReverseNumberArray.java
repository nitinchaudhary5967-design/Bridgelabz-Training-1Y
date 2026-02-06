import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Find the count of digits in the number
        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        // c. Store digits in an array
        int[] digits = new int[digitCount];
        temp = number;

        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // d. Create an array to store digits in reverse order
        int[] reversedDigits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        // e. Display the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }

        sc.close();
    }
}

