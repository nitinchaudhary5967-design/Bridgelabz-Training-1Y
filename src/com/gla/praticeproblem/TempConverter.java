package com.gla.ProblemStatements;
import java.util.Scanner;
public class TempConverter {
    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }
    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        if (choice == 1)
            System.out.println("Result: " + cToF(temp));
        else
            System.out.println("Result: " + fToC(temp));
    }
}
