package com.gla.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("OM", 14);
        map.put("Chirag", 57);
        map.put("Mayank", 90);
        map.put("Nitin", 100);

        System.out.println(map);

        System.out.println(map.get("Nitin"));

        System.out.println(map.containsKey("Aniket"));

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.remove("OM"));


        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());
        for(String Key: map.keySet()){
            System.out.println(Key+" ");
            for(String key : map.keySet()){
                System.out.println(map.get(key)+"");
            }
        }
    }
}
