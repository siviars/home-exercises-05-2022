package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {

    public CreditCard(String number, String owner, int CCVcode, double balance) {
        super(number, owner, CCVcode, balance);
    }

    @Override
    public void takeMoney(double take) {
        super.takeMoney(take);
        if (super.balance.compareTo(new BigDecimal(100)) < 0) {
            System.out.println("Warning: Low funds");
        }
    }

}
