package com.GLA.Constructors_Instance.level1;

public class LibraryBook {
        String title;
        String author;
        double price;
        boolean available;

        LibraryBook(String t, String a, double p) {
            title = t;
            author = a;
            price = p;
            available = true;
        }

        void borrowBook() {
            if (available) {
                available = false;
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Book is not available.");
            }
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
            System.out.println("Available: " + available);
        }

        public static void main(String[] args) {

            LibraryBook book = new LibraryBook("OOP in Java", "Author A", 350);

            book.display();
            book.borrowBook();
            book.display();
        }
}
