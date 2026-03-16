package com.gla.encapsulation.Q7;
abstract class Patient{
    int patientId,age;
    String name;
    Patient(int i,String n,int a){
        patientId=i;
        name=n;
        age=a;
    }
    abstract double calculateBill();
    void getPatientDetails(){
        System.out.println(name+" "+age);
    }
}
interface MedicalRecord{
    void addRecord();
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord{
    InPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 5000;
    }
    public void addRecord(){
        System.out.println("Record Added");
    }
    public void viewRecords(){
        System.out.println("Viewing Record");
    }
}
class OutPatient extends Patient{
    OutPatient(int i,String n,int a){
        super(i,n,a);
    }
    double calculateBill(){
        return 500;
    }
}
public class Main{
    public static void main(String[] args){
        Patient[] p={new InPatient(1,"Rahul",30),new OutPatient(2,"Amit",25)};
        for(Patient x:p){
            x.getPatientDetails();
            System.out.println("Bill="+x.calculateBill());
        }
    }
}
