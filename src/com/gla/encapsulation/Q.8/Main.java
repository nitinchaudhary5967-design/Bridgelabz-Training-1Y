package com.gla.encapsulation.Q8;
abstract class Vehicle{
    String vehicleId,driverName;
    double ratePerKm;
    Vehicle(String v,String d,double r){
        vehicleId=v;
        driverName=d;
        ratePerKm=r;
    }
    abstract double calculateFare(double d);
    void getVehicleDetails(){
        System.out.println(vehicleId+" "+driverName);
    }
}
interface GPS{
    String getCurrentLocation();
    void updateLocation(String loc);
}
class Car extends Vehicle implements GPS{
    Car(String v,String d){super(v,d,15);}
    double calculateFare(double d){
        return d*ratePerKm;
    }
    public String getCurrentLocation(){
        return "City Center";
    }
    public void updateLocation(String l){
        System.out.println("Location Updated");
    }
}
class Bike extends Vehicle{
    Bike(String v,String d){
        super(v,d,8);
    }
    double calculateFare(double d){
        return d*ratePerKm;
    }
}
class Auto extends Vehicle{
    Auto(String v,String d){
        super(v,d,10);
    }
    double calculateFare(double d){
        return d*ratePerKm;
    }
}
public class Main{
    public static void main(String[] args){
        Vehicle[] v={new Car("C1","Raj"),new Bike("B1","Aman"),new Auto("A1","Vijay")};
        for(Vehicle x:v){
            System.out.println("Fare="+x.calculateFare(10));
        }
    }
}
