package org.example.OOPS;

public class CreditCard extends Card implements PaymentMethod{

    public CreditCard(String cardId, String userName) {
        super(cardId, userName);
    }


    @Override
    public void pay() {
        System.out.println("Payment made by CreditCard No.: " + getCardId());
    }
}
