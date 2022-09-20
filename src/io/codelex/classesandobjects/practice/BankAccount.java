package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", 17.25);
        benben.toString();
        benben.deposit(100);
        benben.toString();
        benben.withdraw(200);
        benben.toString();
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        if (this.balance < 0) {
            double balance2 = this.balance * (-1);
            System.out.println(this.name + ", -$" + balance2);
        } else {
            System.out.println(this.name + ", $" + this.balance);
        }
        return null;
    }

    public final void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public final void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

}
