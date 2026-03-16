package com.gla.packagesQuestions.Q5.Library.transactions;
import com.gla.packagesQuestions.Q5.Library.books.Book;
import com.gla.packagesQuestions.Q5.Library.members.Member;
public class Transaction{
    public void issue(Book b,Member m){
        System.out.println(m.name+" issued "+b.title);
    }
}
