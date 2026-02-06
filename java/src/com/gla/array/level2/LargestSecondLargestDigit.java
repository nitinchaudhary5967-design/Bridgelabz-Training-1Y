import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input for number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Define array to store digits with maxDigit = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        // c. Index variable
        int index = 0;

        // d. Loop until number becomes 0
        while (number != 0) {

            // e. Extract last digit and store in array
            int digit = number % 10;
            digits[index] = digit;

            // f. Increment index and check maxDigit
            index++;
            if (index == maxDigit) {
                break;
            }

            // Remove last digit from number
            number /= 10;
        }

        // g. Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // h. Find largest and second largest in the array
        for (int i = 0; i < index; i++) {
            int value = digits[i];

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }

        // i. Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
