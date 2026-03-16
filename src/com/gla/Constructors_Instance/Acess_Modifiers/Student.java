package com.GLA.Constructors_Instance.Acess_Modifiers;

public class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        public void setCGPA(double cgpa) {
            CGPA = cgpa;
        }

        public double getCGPA() {
            return CGPA;
        }
    }

    class PostgraduateStudent extends Student {

        void display() {
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Name: " + name); // protected accessible
            System.out.println("CGPA: " + getCGPA()); // private via getter
        }

        public static void main(String[] args) {

            PostgraduateStudent p = new PostgraduateStudent();
            p.rollNumber = 101;
            p.name = "Rahul";
            p.setCGPA(8.5);

            p.display();
        }
}
