package com.gla.packagesQuestions.Q6B.com.school.main;
import com.gla.packagesQuestions.Q6B.com.school.data.Student;
import com.gla.packagesQuestions.Q6B.com.school.util.Analyzer;

public class main {public static void main(String[] args){
    Student s=new Student("Aniket",80,70,90);
    Analyzer a=new Analyzer();
    double avg=a.calculateAverage(s);
    System.out.println(s);
    System.out.println("Average:"+avg);
    System.out.println("Grade:"+a.findGrade(avg));
  }
}
