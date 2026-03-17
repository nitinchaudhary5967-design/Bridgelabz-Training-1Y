package com.gla.DefiningandImplementingInterfaces;
interface Payment{
    void pay(double amount);
}
class UPI implements Payment{
    public void pay(double amount){
        System.out.println("UPI payment "+amount);
    }
}
class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Card payment "+amount);
    }
}
class Wallet implements Payment{
    public void pay(double amount){
        System.out.println("Wallet payment "+amount);
    }
}
public class DigitalPayment{
    public static void main(String[]args){
        UPI u=new UPI();
        CreditCard c=new CreditCard();
        Wallet w=new Wallet();
        u.pay(500);
    }
}
