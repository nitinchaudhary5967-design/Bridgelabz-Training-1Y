package com.gla.collection;
import java.util.*;
public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(56);
        q.offer(77);
        q.offer(567);
        q.offer(108);

        System.out.println(q.peek());
        System.out.println(q.element());

        q.remove();
    }

}
