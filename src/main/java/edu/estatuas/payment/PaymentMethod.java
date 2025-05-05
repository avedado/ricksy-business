package edu.estatuas.payment;

public interface PaymentMethod {
    boolean pay(double credit);
    String number();
    String cardOwner();
    double credit();
}
