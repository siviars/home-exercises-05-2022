package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    private String name;
    private double balance;

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        benben.printString();
        benben.deposit(100);
        benben.printString();
        benben.withdraw(200);
        benben.printString();
    }

    private BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void printString() {
        if (this.balance < 0) {
            double balance2 = this.balance * (-1);
            System.out.println(this.name + ", -$" + balance2);
        } else {
            System.out.println(this.name + ", $" + this.balance);
        }
    }

    private final void deposit(double amount) {
        this.balance += amount;
    }

    private final void withdraw(double amount) {
        this.balance -= amount;
    }

}
