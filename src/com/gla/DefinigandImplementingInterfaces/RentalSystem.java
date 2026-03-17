package com.gla.DefiningandImplementingInterfaces;
interface Vehicle{
    void rent();
    void returnVehicle();
}
class Car implements Vehicle{
    public void rent(){
        System.out.println("Car rented");
    }
    public void returnVehicle(){
        System.out.println("Car returned");
    }
}
class Bike implements Vehicle{
    public void rent(){
        System.out.println("Bike rented");
    }
    public void returnVehicle(){
        System.out.println("Bike returned");
    }
}
class Bus implements Vehicle{
    public void rent(){
        System.out.println("Bus rented");
    }
    public void returnVehicle(){
        System.out.println("Bus returned");
    }
}
public class RentalSystem{
    public static void main(String[]args){
        Car c=new Car();
        Bike b=new Bike();
        Bus bs=new Bus();
        c.rent();b.rent();bs.rent();
    }
}