package com.gla.collection;

import java.util.*;

public class Set {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(45);
        set.add(18);
        set.add(33);
        set.add(10);
        set.add(17);
        set.add(25);
        set.add(1);
        System.out.println(set);
        set.remove(10);
        System.out.println(set);
        System.out.println(set.contains(15));
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        for(int val:set){
            System.out.println(val+" ");
        }
        System.out.println();

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
