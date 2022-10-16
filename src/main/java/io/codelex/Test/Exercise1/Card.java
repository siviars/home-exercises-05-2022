package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public abstract class Card {
    String number;
    String owner;
    int CCVcode;
    BigDecimal balance;

    public Card(String number, String owner, int CCVcode, double balance) {
        this.number = number;
        this.owner = owner;
        this.CCVcode = CCVcode;
        this.balance =  new BigDecimal(balance);
    }

    public void addMoney(double add) {
        balance = balance.add(new BigDecimal(add));
    }

    public void takeMoney(double take) {
        if (balance.compareTo(new BigDecimal(take)) < 0) {
            System.out.println("Not enough money");
        } else {
            balance = balance.subtract(new BigDecimal(take));
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
