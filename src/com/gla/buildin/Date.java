package com.gla.BuildIn;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);
        date = date.plusDays(7);
        date = date.plusMonths(1);
        date = date.plusYears(2);
        date = date.minusWeeks(3);
        System.out.println("Final Date: " + date);
    }
}

