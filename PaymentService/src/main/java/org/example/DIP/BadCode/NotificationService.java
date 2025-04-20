package org.example.DIP.BadCode;

public class NotificationService {
    private EmailService emailService;
    private SmsService smsService;

    public NotificationService(EmailService emailService, SmsService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }
    // This is tightly coupled.
    // Testing is difficult cause this notification service is dependent on email service and sms service.
    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }

    public void notifyBySms(String message) {
        smsService.sendSms(message);
    }
}
