package io.codelex.classesandobjects.practice;

public class Account {
    private double balance;
    private String owner;

    public static void main(String[] args) {
        Account matAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        matAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matAccount);
        System.out.println(myAccount);

        Account aAccount = new Account("A", 100);
        Account bAccount = new Account("B", 0);
        Account cAccount = new Account("C", 0);
        transfer(aAccount, bAccount, 50);
        transfer(aAccount, cAccount, 25);
        System.out.println(aAccount);
        System.out.println(bAccount);
        System.out.println(cAccount);

    }


    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
