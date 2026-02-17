package com.gla.classesAndobjects.level02;
import java.util.*;
class UnitConverter2{
    public static double convertYardsToFeet(double y){
        return y*3;
    }
    public static double convertFeetToYards(double f){
        return f*0.333333;
    }
    public static double convertMetersToInches(double m){
        return m*39.3701;
    }
    public static double convertInchesToMeters(double i){
        return i*0.0254;
    }
    public static double convertInchesToCm(double i){
        return i*2.54;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        System.out.println("YardsToFeet "+convertYardsToFeet(v));
        System.out.println("FeetToYards "+convertFeetToYards(v));
        System.out.println("MetersToInches "+convertMetersToInches(v));
        System.out.println("InchesToMeters "+convertInchesToMeters(v));
        System.out.println("InchesToCm "+convertInchesToCm(v));
    }
}



