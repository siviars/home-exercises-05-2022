package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {

    public DebitCard(String number, String owner, int CCVcode, double balance) {
        super(number, owner, CCVcode, balance);
    }

    @Override
    public void addMoney(double add) {
        super.addMoney(add);
        if (super.balance.compareTo(new BigDecimal(10000)) > 0) {
            System.out.println("Warning: Too much money");
        }
    }
}
