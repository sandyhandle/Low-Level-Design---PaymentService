package org.example.OOPS;

import java.sql.SQLOutput;

public class DebitCard extends Card implements PaymentMethod{

    public DebitCard(String cardId, String userName) {
        super(cardId, userName);
    }


    @Override
    public void pay() {
        System.out.println("Payment made by DebitCard No.: " + getCardId());
    }
}
