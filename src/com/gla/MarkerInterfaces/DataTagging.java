package com.gla.MarkerInterfaces;
interface Sensitive{}
class UserData implements Sensitive{
    String password="12345";
}
public class DataTagging{
    public static void main(String[]args){
        UserData u=new UserData();
        if(u instanceof Sensitive)System.out.println("Encrypt this data");
    }
}