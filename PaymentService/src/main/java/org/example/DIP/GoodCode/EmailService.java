package org.example.DIP.GoodCode;

public class EmailService implements NotificationChannel {

    @Override
    public void send(String message) {
        System.out.println("Sending Email : " + message);
    }
}
