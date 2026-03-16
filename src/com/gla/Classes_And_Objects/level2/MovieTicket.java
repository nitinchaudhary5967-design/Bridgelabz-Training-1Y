package com.GLA.Classes_And_Objects.level2;

public class MovieTicket {
        String movieName;
        int seatNumber;
        double price;

        void bookTicket(String movie, int seat, double ticketPrice) {
            movieName = movie;
            seatNumber = seat;
            price = ticketPrice;
        }

        void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat No: " + seatNumber);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {

            MovieTicket ticket = new MovieTicket();
            ticket.bookTicket("Avengers", 12, 250);

            ticket.displayTicket();
        }
}
