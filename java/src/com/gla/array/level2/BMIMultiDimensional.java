import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // b. Create 2D array and status array
        double[][] personData = new double[number][3]; // 0: height, 1: weight, 2: BMI
        String[] weightStatus = new String[number];

        // c. Input weight and height
        for (int i = 0; i < number; i++) {

            double height, weight;

            // Input height
            while (true) {
                System.out.print("Enter height in meters for Person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Height must be positive. Try again.");
            }

            // Input weight
            while (true) {
                System.out.print("Enter weight in kg for Person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Weight must be positive. Try again.");
            }

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;
        }

        // d. Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display the results
        System.out.println("\n----------------------------------------------");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\tStatus");
        System.out.println("----------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf(
                    "%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1),
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]
            );
        }

        sc.close();
    }
}
