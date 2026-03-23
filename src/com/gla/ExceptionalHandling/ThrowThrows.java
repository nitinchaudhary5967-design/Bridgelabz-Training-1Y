package com.gla.exceptionHandling.Q6;
import java.util.*;
public class ThrowThrows {
    static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }
        return (amount * rate * years) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter amount, rate, years: ");
            double a = sc.nextDouble();
            double r = sc.nextDouble();
            int y = sc.nextInt();
            double interest = calculateInterest(a, r, y);
            System.out.println("Interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: Amount and rate must be positive");
        }
    }
}
