package com.gla.StaticMethodsinInterfaces;
interface SecurityUtils{
        static boolean checkPassword(String p){
            return p.length()>=8;
        }
    }
public class PassStrengthValid{
        public static void main(String[]args){
            System.out.println(SecurityUtils.checkPassword("mypassword"));
        }
    }
