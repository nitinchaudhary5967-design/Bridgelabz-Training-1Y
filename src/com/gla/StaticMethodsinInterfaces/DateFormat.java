package com.gla.StaticMethodsinInterfaces;
import java.time.LocalDate;
interface DateUtil{
    static String formatDate(LocalDate d){
        return d.toString();
    }
}
public class DateFormat{
    public static void main(String[]args){
        System.out.println(DateUtil.formatDate(LocalDate.now()));
    }
}
