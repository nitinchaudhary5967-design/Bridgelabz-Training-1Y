package com.gla.Wrapper;
import java.util.ArrayList;
public class Wrapper1 {
    static void main(String[]args){
        int a = 10;  //Boxing
        Integer b=a;   //autoboxing
        Integer s=new Integer(7);
        int k=s.intValue();  //unboxing
        int x=b;  //auto unboxing
    }
}
