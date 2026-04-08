package com.gla.collection;

import java.util.*;

public class Deque2 {
    public static void main(String[] args){

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(56);
        dq.offerFirst(45);
        dq.addLast(67);
        dq.offerLast(78);

        System.out.println(dq.peekFirst());

        System.out.println(dq.peekLast());

        dq.removeFirst();

        System.out.println(dq);
    }
}