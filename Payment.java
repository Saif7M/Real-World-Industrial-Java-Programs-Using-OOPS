// File: Payment.java (inside src/payment/)
package payment;

class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

// File: CreditCardPayment.java
package payment;

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

// File: UpiPayment.java
package payment;

class UpiPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

public class PaymentProcessing {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(1000);

        Payment payment2 = new UpiPayment();
        payment2.processPayment(500);
    }
}

