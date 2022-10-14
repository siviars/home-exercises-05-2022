package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    String number;
    String owner;
    int CCVcode;
    int balance;

    public Card(String number, String owner, int CCVcode, int balance) {
        this.number = number;
        this.owner = owner;
        this.CCVcode = CCVcode;
        this.balance = balance;
    }

    public void addMoney(int add) {
        balance = balance+add;
    }

    public void takeMoney(int take) {

        if (take > balance) {
            System.out.println("Not enough money");
        } else {
            balance = balance-take;
        }
    }

    public int getBalance() {
        return balance;
    }

}
