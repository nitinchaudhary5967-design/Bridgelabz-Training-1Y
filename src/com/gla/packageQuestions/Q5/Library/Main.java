package com.gla.packagesQuestions.Q5.Library;
import com.gla.packagesQuestions.Q5.Library.books.*;
import com.gla.packagesQuestions.Q5.Library.members.*;
import com.gla.packagesQuestions.Q5.Library.transactions.*;
public class Main{
    public static void main(String[] args){
        Book b=new Book(1,"Java");
        Member m=new Member(101,"Nitin");

        Transaction t=new Transaction();
        b.display();
        m.display();
        t.issue(b,m);
    }
}