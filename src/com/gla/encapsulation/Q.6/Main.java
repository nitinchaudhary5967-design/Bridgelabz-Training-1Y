package com.gla.encapsulation.Q6;
abstract class FoodItem{
    String itemName;
    double price;
    int quantity;
    FoodItem(String n,double p,int q){
        itemName=n;
        price=p;
        quantity=q;
    }
    abstract double calculateTotalPrice();
    void getItemDetails(){
        System.out.println(itemName+" "+price);
    }
}
interface Discountable{
    double applyDiscount();
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    VegItem(String n,double p,int q){
        super(n,p,q);
    }
    double calculateTotalPrice(){
        return price*quantity;
    }
    public double applyDiscount(){
        return price*0.1;
    }
    public String getDiscountDetails(){
        return "10% Veg Discount";
    }
}
class NonVegItem extends FoodItem{
    NonVegItem(String n,double p,int q){
        super(n,p,q);
    }
    double calculateTotalPrice(){
        return price*quantity+50;
    }
}
public class Main{
    public static void main(String[] args){
        FoodItem[] f={new VegItem("Paneer",200,2),new NonVegItem("Chicken",300,1)};
        for(FoodItem x:f){
            System.out.println("Total="+x.calculateTotalPrice());
        }
    }
}
