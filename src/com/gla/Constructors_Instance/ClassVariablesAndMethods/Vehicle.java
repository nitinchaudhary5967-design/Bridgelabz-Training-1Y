package com.GLA.Constructors_Instance.ClassVariablesAndMethods;

public class Vehicle {
        String ownerName;
        String vehicleType;

        static double registrationFee = 5000;

        Vehicle(String owner, String type) {
            ownerName = owner;
            vehicleType = type;
        }

        void displayVehicleDetails() {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }

        static void updateRegistrationFee(double fee) {
            registrationFee = fee;
        }

        public static void main(String[] args) {

            Vehicle v1 = new Vehicle("Amit", "Car");
            v1.displayVehicleDetails();

            Vehicle.updateRegistrationFee(6000);
            System.out.println("-----");

            v1.displayVehicleDetails();
        }

}
