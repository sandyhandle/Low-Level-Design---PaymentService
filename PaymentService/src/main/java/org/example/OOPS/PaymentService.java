package org.example.OOPS;

import java.util.HashMap;

public class PaymentService {
    HashMap<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        this.paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod paymentMethod){
        paymentMethods.put(name, paymentMethod);
    }
    public void makePayment(String name){
        paymentMethods.get(name).pay();
    }
}
