package com.GLA.Constructors_Instance.Acess_Modifiers;

public class BankAccount {
        public int accountNumber;
        protected String accountHolder;
        private double balance;

        public void setBalance(double b) {
            balance = b;
        }

        public double getBalance() {
            return balance;
        }
    }

    class SavingsAccount extends BankAccount {

        void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + getBalance());
        }

        public static void main(String[] args) {

            SavingsAccount s = new SavingsAccount();
            s.accountNumber = 1234;
            s.accountHolder = "Aman";
            s.setBalance(10000);

            s.display();
        }
}
