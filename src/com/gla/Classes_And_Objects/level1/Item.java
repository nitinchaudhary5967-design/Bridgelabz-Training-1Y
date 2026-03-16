package com.GLA.Classes_And_Objects.level1;

public class Item {
        int itemCode;
        String itemName;
        double price;

        void displayDetails() {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price: " + price);
        }

        double calculateTotalCost(int quantity) {
            return price * quantity;
        }

        public static void main(String[] args) {

            Item item = new Item();
            item.itemCode = 101;
            item.itemName = "Pen";
            item.price = 20;

            item.displayDetails();
            System.out.println("Total Cost (5 items): " + item.calculateTotalCost(5));
        }
}
