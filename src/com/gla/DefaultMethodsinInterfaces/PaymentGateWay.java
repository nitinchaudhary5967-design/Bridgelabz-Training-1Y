package com.gla.DefaultMethodsinInterfaces;
interface PaymentProcessor{
    void pay(double amt);
    default void refund(double amt){
        System.out.println("Refund "+amt);
    }
}
class Paytm implements PaymentProcessor{
    public void pay(double amt){
        System.out.println("Paytm "+amt);
    }
}
public class PaymentGateWay{
    public static void main(String[]args){
        Paytm p=new Paytm();
        p.pay(500);
        p.refund(200);
    }
}
