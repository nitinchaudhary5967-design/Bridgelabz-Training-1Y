import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays to store marks, percentage, and grade
        int[][] marks = new int[n][3];     // 0: Physics, 1: Chemistry, 2: Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // c. Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Physics marks
            System.out.print("Physics: ");
            int p = sc.nextInt();

            // Chemistry marks
            System.out.print("Chemistry: ");
            int c = sc.nextInt();

            // Maths marks
            System.out.print("Maths: ");
            int m = sc.nextInt();

            // Validation check
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks entered. Please enter positive marks.");
                i--; // decrement index to retry
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

            // Grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }

        // e. Display results
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf(
                    "%d\t%d\t%d\t\t%d\t%.2f%%\t\t%s\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]
            );
        }

        sc.close();
    }
}
