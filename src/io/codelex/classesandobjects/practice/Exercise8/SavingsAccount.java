package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;

public class SavingsAccount {

    private double interestRate, balance, withdrawn, deposit, totalDeposit, totalWithdrawn, interestEarn, beginBalance;
    private int month;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SavingsAccount one = new SavingsAccount();
        System.out.print("How much money is in the account?: ");
        one.setBalance(in.nextDouble());
        System.out.print("Enter the annual interest rate: ");
        one.setInterestRate(in.nextDouble());
        System.out.print("How long has the account been opened? ");
        one.setMonth(in.nextInt());
        System.out.println();
        for (int i = 1; i <= one.getMonth(); i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            one.setDeposit(in.nextDouble());
            System.out.print("Enter amount withdrawn for " + i + ": ");
            one.setWithdrawn(in.nextDouble());
            one.addingDeposit();
            one.subtractingWithdrawal();
            one.addingInterest();
        }
        System.out.println("Total deposited: $" + one.totalDeposit);
        System.out.println("Total withdrawn: $" + one.totalWithdrawn);
        System.out.println("Interest earned: $" + one.interestEarn);
        System.out.println("Ending balance: $" + one.endingBalance());
    }

    private double endingBalance() {
        return this.totalDeposit - this.totalWithdrawn + this.interestEarn + beginBalance;
    }

    private void subtractingWithdrawal() {
        this.balance -= this.withdrawn;
        this.totalWithdrawn += this.withdrawn;
    }

    private void addingDeposit() {
        this.balance += this.deposit;
        this.totalDeposit += this.deposit;
    }

    private void addingInterest() {
        this.interestEarn = this.interestEarn + this.balance * (this.interestRate / 12 / 100);
    }

    private void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    private void setBalance(double balance) {
        this.balance = balance;
        this.beginBalance = balance;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private void setMonth(int month) {
        this.month = month;
    }

    private void setWithdrawn(double withdrawn) {
        this.withdrawn = withdrawn;
    }

    private int getMonth() {
        return month;
    }
}