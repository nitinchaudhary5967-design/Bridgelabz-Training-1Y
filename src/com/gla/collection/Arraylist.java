package com.gla.collection;
import java.util.ArrayList;
public class Arraylist {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("shaktimaan");
        list.add("Diamond");
        System.out.println(list);
        System.out.println(list.get(1));  //get
        list.add(1,"Silver");
        System.out.println(list);
        System.out.println(list.size());    //size
        list.remove(1);
        System.out.println(list);
        list.set(1,"gold");    //set
        System.out.println(list);
        System.out.println(list.contains("gold"));//contains
        System.out.println();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " ");  //total how many
        }
        System.out.println();
        for(String str: list){
            System.out.println(str);
        }
    }
}