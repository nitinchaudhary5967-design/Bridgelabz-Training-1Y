package com.gla.DefaultMethodsinInterfaces;
interface Vehicle{
    void displaySpeed();
    default void displayBattery(){
        System.out.println("Battery 80%");
    }
}
class ElectricCar implements Vehicle{
    public void displaySpeed(){
        System.out.println("Speed 60km/h");
    }
}
public class VehicleDashBoard{
    public static void main(String[]args){
        ElectricCar e=new ElectricCar();
        e.displaySpeed();
        e.displayBattery();
    }
}
