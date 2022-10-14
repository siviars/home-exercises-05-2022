package io.codelex.Test.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card{


    public DebitCard(String number, String owner, int CCVcode, int balance) {
        super(number, owner, CCVcode, balance);
    }

    @Override
    public void addMoney(int add) {
        super.addMoney(add);
               if(super.balance>10000){
            System.out.println("Warning: Too much money");
        }
    }

    @Override
    public void takeMoney(int take) {
        super.takeMoney(take);
    }
}
