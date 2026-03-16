package com.gla.encapsulation.Q3;
abstract class Vehicle{
    String vehicleNumber,type;
    double rentalRate;
    Vehicle(String n,String t,double r){
        vehicleNumber=n;
        type=t;
        rentalRate=r;
    }
    abstract double calculateRentalCost(int days);
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    Car(String n){super(n,"Car",2000);}
    double calculateRentalCost(int d){return rentalRate*d;}
    public double calculateInsurance(){
        return 500;
    }
    public String getInsuranceDetails(){
        return "Car Insurance";
    }
}
class Bike extends Vehicle implements Insurable{
    Bike(String n){
        super(n,"Bike",500);
    }
    double calculateRentalCost(int d){
        return rentalRate*d;
    }
    public double calculateInsurance(){
        return 100;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance";
    }
}
class Truck extends Vehicle{
    Truck(String n){
        super(n,"Truck",4000);
    }
    double calculateRentalCost(int d){
        return rentalRate*d;
    }
}
public class Main{
    public static void main(String[] args){
        Vehicle[] v={new Car("C1"),new Bike("B1"),new Truck("T1")};
        for(Vehicle x:v){
            System.out.println("Rental="+x.calculateRentalCost(5));
            if(x instanceof Insurable){
                Insurable i=(Insurable)x;
                System.out.println("Insurance="+i.calculateInsurance());
            }
        }
    }
}
