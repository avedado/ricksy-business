package edu.estatuas.dispatchers;

import edu.estatuas.payment.PaymentMethod;
import edu.estatuas.receptivo.GuestDispatcher;

public class CristalExpender implements GuestDispatcher {

    private int stock;
    private double itemCost;

    CristalExpender(int stock, double itemCost){
        this.stock=stock;
        this.itemCost=itemCost;
    }

    @Override
    public void dispatch(PaymentMethod card) {
    }

    @Override
    public String toString(){
        return "stock: " + stock() +
                "/ncost: " + itemCost;
    }

    int stock(){
        return this.stock;
    }
}
