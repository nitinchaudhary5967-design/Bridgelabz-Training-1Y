package com.gla.packagesQuestions.Q5.Library.books;
public class Book {
    public int id;
    public String title;
    public Book(int id,String title){
        this.id=id;
        this.title=title;
    }
    public void display(){
        System.out.println("Book:"+id+" "+title);
    }
}

