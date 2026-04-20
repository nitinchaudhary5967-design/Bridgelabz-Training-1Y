package com.gla.functionalInterface;

public class Main {
    public static void main(String[] args) {
//        Employee obj = new SoftwareEngineer();
//        System.out.println(obj.getname());
      Employee obj = () -> "SoftwareEngineer";
              System.out.println(obj.getname());
      Employee obj2 = () -> "Doctor";
        System.out.println(obj2.getname());
    }
}
