package com.GLA.Classes_And_Objects.level2;

public class CartItem {
        String itemName;
        double price;
        int quantity;

        void addItem(String name, double p, int q) {
            itemName = name;
            price = p;
            quantity = q;
        }

        void removeItem() {
            quantity = 0;
            System.out.println("Item removed from cart.");
        }

        void displayTotalCost() {
            System.out.println("Total Cost: " + (price * quantity));
        }

        public static void main(String[] args) {

            CartItem cart = new CartItem();
            cart.addItem("Shoes", 2000, 2);
            cart.displayTotalCost();

            cart.removeItem();
            cart.displayTotalCost();
        }
}
