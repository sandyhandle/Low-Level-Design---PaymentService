package org.example.DIP.GoodCode;

public class SmsService implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending Message : " + message);
    }
}
