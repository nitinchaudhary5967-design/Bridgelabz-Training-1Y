package com.GLA.Constructors_Instance.ClassVariablesAndMethods;

public class Course {
        String courseName;
        int duration;
        double fee;

        static String instituteName = "ABC Institute";

        Course(String name, int d, double f) {
            courseName = name;
            duration = d;
            fee = f;
        }

        void displayCourseDetails() {
            System.out.println("Institute: " + instituteName);
            System.out.println("Course: " + courseName);
            System.out.println("Duration: " + duration + " months");
            System.out.println("Fee: " + fee);
        }

        static void updateInstituteName(String newName) {
            instituteName = newName;
        }

        public static void main(String[] args) {

            Course c1 = new Course("Java", 6, 15000);
            c1.displayCourseDetails();

            Course.updateInstituteName("XYZ Academy");
            System.out.println("-----");

            c1.displayCourseDetails();
        }
}
