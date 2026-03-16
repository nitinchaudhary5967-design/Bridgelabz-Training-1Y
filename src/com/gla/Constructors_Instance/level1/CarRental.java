package com.GLA.Constructors_Instance.level1;

public class CarRental {
        String customerName;
        String carModel;
        int rentalDays;
        double dailyRate = 2000;

        // Constructor
        CarRental(String name, String model, int days) {
            customerName = name;
            carModel = model;
            rentalDays = days;
        }

        double calculateTotalCost() {
            return rentalDays * dailyRate;
        }

        void display() {
            System.out.println("Customer: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: " + calculateTotalCost());
        }

        public static void main(String[] args) {

            CarRental rental = new CarRental("Vikram", "Hyundai Creta", 4);
            rental.display();
        }
}
