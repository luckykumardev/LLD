class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentMethod.equalsIgnoreCase("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentMethod.equalsIgnoreCase("Crypto")) {
            System.out.println("Processing cryptocurrency payment of $" + amount);
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard", 100.0);
        paymentProcessor.processPayment("PayPal", 150.0);
        paymentProcessor.processPayment("Crypto", 200.0);
    }
}
