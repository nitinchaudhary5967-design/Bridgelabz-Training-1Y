package com.gla.exceptionHandling.Q9;
import java.util.*;
public class NestedTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};
        try {
            int index = sc.nextInt();
            try {
                int divisor = sc.nextInt();
                System.out.println(arr[index] / divisor);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
