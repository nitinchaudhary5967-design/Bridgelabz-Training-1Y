package com.GLA.Constructors_Instance.level1;

public class Circle {
        double radius;

        // Default Constructor
        Circle() {
            this(1.0);   // Constructor chaining
        }

        // Parameterized Constructor
        Circle(double r) {
            radius = r;
        }

        double area() {
            return Math.PI * radius * radius;
        }

        public static void main(String[] args) {

            Circle c1 = new Circle();
            Circle c2 = new Circle(5);

            System.out.println("Default Radius Area: " + c1.area());
            System.out.println("Given Radius Area: " + c2.area());
        }
}
