package org.example.DIP.GoodCode;

import org.example.DIP.GoodCode.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailService());

        notificationService.notify("Your message has been sent successfully.");
    }
}
