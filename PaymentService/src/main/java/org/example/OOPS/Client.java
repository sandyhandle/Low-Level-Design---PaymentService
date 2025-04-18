package org.example.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.addPaymentMethod("SanthoshDebitCard", new DebitCard("9868", "Santhosh Puvaneswaran"));
        ps.addPaymentMethod("SanthoshCreditCard", new DebitCard("2355", "Santhosh Puvaneswaran"));
        ps.addPaymentMethod("SanthoshUPI", new UPI("santhoshHdfc"));

        ps.makePayment("SanthoshUPI");
        ps.makePayment("SanthoshDebitCard");

    }
}
