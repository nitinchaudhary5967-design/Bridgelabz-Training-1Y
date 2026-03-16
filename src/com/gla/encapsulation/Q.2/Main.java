package com.gla.encapsulation.Q2;
import java.util.*;
abstract class Product{
    private int productId;
    private String name;
    private double price;
    Product(int id,String n,double p){
        productId=id;
        name=n;
        price=p;
    }
    public double getPrice(){return price;}
    abstract double calculateDiscount();
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    Electronics(int id,String n,double p){
        super(id,n,p);
    }
    double calculateDiscount(){
        return getPrice()*0.10;
    }
    public double calculateTax(){
        return getPrice()*0.18;
    }
    public String getTaxDetails(){
        return "18% GST";
    }
}
class Clothing extends Product implements Taxable{
    Clothing(int id,String n,double p){
        super(id,n,p);
    }

    double calculateDiscount(){
        return getPrice()*0.15;
    }
    public double calculateTax(){
        return getPrice()*0.05;
    }
    public String getTaxDetails(){
        return "5% GST";
    }
}
class Groceries extends Product{
    Groceries(int id,String n,double p){super(id,n,p);}
    double calculateDiscount(){return getPrice()*0.05;}
}
class Main{
    public static void main(String[] args){
        Product p1=new Electronics(1,"Laptop",50000);
        Product p2=new Clothing(2,"Shirt",2000);
        Product p3=new Groceries(3,"Rice",1000);
        Product[] list={p1,p2,p3};
        for(Product p:list){
            double tax=0;
            if(p instanceof Taxable){
                tax=((Taxable)p).calculateTax();
            }
            double finalPrice=p.getPrice()+tax-p.calculateDiscount();
            System.out.println("Final Price="+finalPrice);
        }
    }
}
