package com.gla.packagesQuestions.Q5.Library.members;

public class Member {
        public int id;
        public String name;
        public Member(int id,String name){
            this.id=id;
            this.name=name;
        }
        public void display(){
            System.out.println("Member:"+id+" "+name);
        }
    }

