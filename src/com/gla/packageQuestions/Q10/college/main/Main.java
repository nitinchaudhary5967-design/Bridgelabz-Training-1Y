package com.gla.packagesQuestions.Q10.college.main;

import com.gla.packagesQuestions.Q10.college.department.Department;
import com.gla.packagesQuestions.Q10.college.faculty.Faculty;
import com.gla.packagesQuestions.Q10.college.student.Student;
public class Main {
    public static void main(String[] args){
        Student s=new Student("Aniket");
        Faculty f=new Faculty("Mr. Raj Kumar");
        Department d=new Department("CSE");
        s.display();
        f.display();
        d.display();
    }
}
