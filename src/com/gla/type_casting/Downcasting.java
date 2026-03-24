package com.gla.type_casting;

class Vehicle {
    void display(){
        System.out.println("Vehicle registered");
    }
}
class Mercedes extends Vehicle{
    void speed(){
        System.out.println("Super Comfort");
    }
}
class DownCasting{
    static void main(String[]args){
        Vehicle v = new Mercedes();
        Mercedes A = (Mercedes)v;
        v.display();
        A.speed();
    }
}
