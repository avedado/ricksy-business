package edu.estatuas.receptivo;

import edu.estatuas.payment.PaymentMethod;

public interface GuestDispatcher {
    void dispatch(PaymentMethod card);

}
