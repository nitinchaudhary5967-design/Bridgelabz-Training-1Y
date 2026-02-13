package com.gla.ProblemStatements;
import java.util.*;
class GuessingGame{
    static int generateGuess(int low,int high){
        return low+(int)(Math.random()*(high-low+1));
    }
    static String getFeedback(Scanner sc){
        return sc.next();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int low=1,high=100;
        System.out.println("Think a number between 1 and 100");
        while(true){
            int guess=generateGuess(low,high);
            System.out.println("Is it "+guess+"? (high/low/correct)");
            String fb=getFeedback(sc);
            if(fb.equals("correct"))break;
            else if(fb.equals("high"))high=guess-1;
            else if(fb.equals("low"))low=guess+1;
        }
        System.out.println("Guessed successfully!");
    }
}

