package com.GLA.Constructors_Instance.level1;

public class HotelBooking {
        String guestName;
        String roomType;
        int nights;

        // Default Constructor
        HotelBooking() {
            guestName = "Guest";
            roomType = "Standard";
            nights = 1;
        }

        // Parameterized Constructor
        HotelBooking(String name, String room, int n) {
            guestName = name;
            roomType = room;
            nights = n;
        }

        // Copy Constructor
        HotelBooking(HotelBooking hb) {
            this.guestName = hb.guestName;
            this.roomType = hb.roomType;
            this.nights = hb.nights;
        }

        void display() {
            System.out.println("Guest: " + guestName);
            System.out.println("Room Type: " + roomType);
            System.out.println("Nights: " + nights);
        }

        public static void main(String[] args) {

            HotelBooking h1 = new HotelBooking();
            HotelBooking h2 = new HotelBooking("Amit", "Deluxe", 3);
            HotelBooking h3 = new HotelBooking(h2);

            h1.display();
            System.out.println("-----");
            h2.display();
            System.out.println("-----");
            h3.display();
        }
}
