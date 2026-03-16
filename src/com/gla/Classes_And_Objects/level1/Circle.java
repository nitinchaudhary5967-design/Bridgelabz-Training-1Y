package com.GLA.Classes_And_Objects.level1;

public class Circle {
        double radius;

        double calculateArea() {

            return Math.PI * radius * radius;
        }

        double calculateCircumference() {

            return 2 * Math.PI * radius;
        }

        public static void main(String[] args) {

            Circle c = new Circle();
            c.radius = 5;

            System.out.println("Area: " + c.calculateArea());
            System.out.println("Circumference: " + c.calculateCircumference());
        }
}
