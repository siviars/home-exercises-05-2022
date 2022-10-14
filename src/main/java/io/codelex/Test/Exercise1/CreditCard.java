package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card{

    public CreditCard(String number, String owner, int CCVcode, int balance) {
        super(number, owner, CCVcode, balance);

    }

    @Override
    public void addMoney(int add) {
        super.addMoney(add);
    }

    @Override
    public void takeMoney(int take) {
        super.takeMoney(take);
              if(super.balance<100){
            System.out.println("Warning: Low funds");
        }
    }



}
