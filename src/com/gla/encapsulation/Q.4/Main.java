package com.gla.encapsulation.Q4;
abstract class BankAccount{
    private int accountNumber;
    private String holderName;
    protected double balance;
    BankAccount(int a,String n,double b){
        accountNumber=a;
        holderName=n;
        balance=b;
    }
    void deposit(double a){
        balance+=a;
    }
    void withdraw(double a){
        balance-=a;
    }
    abstract double calculateInterest();
}
interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();
}
class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(int a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return balance*0.04;
    }
    public void applyForLoan(){
        System.out.println("Loan Applied");
    }
    public double calculateLoanEligibility(){
        return balance*2;
    }
}
class CurrentAccount extends BankAccount{
    CurrentAccount(int a,String n,double b){
        super(a,n,b);
    }
    double calculateInterest(){
        return balance*0.02;
    }
}
public class Main{
    public static void main(String[] args){
        BankAccount[] acc={new SavingsAccount(1,"A",10000),new CurrentAccount(2,"B",20000)};
        for(BankAccount a:acc){
            System.out.println("Interest="+a.calculateInterest());
        }
    }
}
