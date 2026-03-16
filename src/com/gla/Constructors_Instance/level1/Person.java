package com.GLA.Constructors_Instance.level1;

public class Person {
        String name;
        int age;

        // Parameterized Constructor
        Person(String n, int a) {
            name = n;
            age = a;
        }

        // Copy Constructor
        Person(Person p) {
            this.name = p.name;
            this.age = p.age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

        public static void main(String[] args) {

            Person p1 = new Person("Rahul", 22);
            Person p2 = new Person(p1);   // Copy constructor

            p1.display();
            System.out.println("-----");
            p2.display();
        }
}
