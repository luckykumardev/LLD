// Payment Strategy Interface
interface PaymentStrategy {
    void pay(double amount);
}

// Credit Card Payment Strategy
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPal Payment Strategy
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Cryptocurrency Payment Strategy
class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount);
    }
}

// Context Class
class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Use Credit Card Payment
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.processPayment(100.0);

        // Use PayPal Payment
        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.processPayment(150.0);

        // Use Cryptocurrency Payment
        paymentContext.setPaymentStrategy(new CryptoPayment());
        paymentContext.processPayment(200.0);
    }
}
