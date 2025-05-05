package edu.estatuas.payment;

public class CreditCard {

    private final String owner;
    private final String number;
    private double credit;
    private final String SYMBOL;

    CreditCard(String owner, String number){
        this.owner=owner;
        this.number=number;
    }

    boolean pay(double credit){
    }

    String number(){
        return this.number;
    }

    String cardOwner(){
        return this.owner;
    }

    double credit(){
        return this.credit;
    }

    @Override
    public String toString(){
        return "owner: " + cardOwner() +
                "/nnumber: " + number() +
                "/ncredit: " + credit() + 3000.0 + SYMBOL;
    }
}
