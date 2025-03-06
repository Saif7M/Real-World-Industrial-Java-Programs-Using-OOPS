// File: Notification.java (inside src/notification/)
package notification;

interface Notification {
    void sendNotification(String message);
}

// File: EmailNotification.java
package notification;

class EmailNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// File: SmsNotification.java
package notification;

class SmsNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        email.sendNotification("Your order has been shipped.");

        Notification sms = new SmsNotification();
        sms.sendNotification("Your OTP is 123456.");
    }
}

