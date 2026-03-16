package com.gla.encapsulation.Q5;
abstract class LibraryItem{
    int itemId;
    String title,author;
    LibraryItem(int i,String t,String a){
        itemId=i;
        title=t;
        author=a;
    }
    abstract int getLoanDuration();
    void getItemDetails(){
        System.out.println(title+" by "+author);
    }
}
interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    Book(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 14;
    }
    public void reserveItem(){
        System.out.println("Book Reserved");
    }
    public boolean checkAvailability(){
        return true;
    }
}
class Magazine extends LibraryItem{
    Magazine(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 7;
    }
}
class DVD extends LibraryItem{
    DVD(int i,String t,String a){
        super(i,t,a);
    }
    int getLoanDuration(){
        return 3;
    }
}
public class Main{
    public static void main(String[] args){
        LibraryItem[] items={new Book(1,"Java","James"),new Magazine(2,"Tech","Editor"),new DVD(3,"Movie","Director")};
        for(LibraryItem i:items){
            i.getItemDetails();
            System.out.println("Loan Days="+i.getLoanDuration());
        }
    }
}
