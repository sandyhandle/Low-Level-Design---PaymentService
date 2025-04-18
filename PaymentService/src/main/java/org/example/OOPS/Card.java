package org.example.OOPS;

public class Card {
    private String cardId;
    private String userName;

    public Card(String cardId, String userName) {
        this.cardId = cardId;
        this.userName = userName;
    }

    public String getCardId() {
        return cardId;
    }

    public String getUserName() {
        return userName;
    }
}
