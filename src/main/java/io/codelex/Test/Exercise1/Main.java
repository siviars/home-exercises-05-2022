package io.codelex.Test.Exercise1;

public class Main {

    public static void main(String[] args) {
        CreditCard credit = new CreditCard("111-222-333", "Jon Smith", 865, 1500);
        DebitCard debit = new DebitCard("444-555-666", "Santa Barbar", 754, 1200);
        credit.takeMoney(1420);
        debit.addMoney(10000);
        System.out.println(credit.getBalance());
        System.out.println(debit.getBalance());
    }
}
