//Andrew Masone
/*
You have been hired to create a payment system that supports different kinds of payments on an
e-commerce site. A previous consultant has created the following abstract class to handle payments:
PaymentGateway.java
public abstract class PaymentGateway {
public abstract void processPayment(double amount);
public abstract void refundPayment(double amount);
}
You have to do the following:
(a) Create a class named PayPal that extends PaymentGateway. The PayPal class should have the
following methods:
i. A constructor that creates a PayPal object with the specified email and password.
ii. A method named processPayment that prints the message “Processing payment of (amount)
with PayPal for account (email)”.
iii. A method named refundPayment that prints the message “Refunding payment of (amount)
with PayPal for account (email)”.
(b) Create a class named CreditCard that extends PaymentGateway. The CreditCard class should
have the following methods:
i. A constructor that creates a CreditCard objct with the specified card number and expiration
date.
ii. A method named processPayment that prints the message “Processing payment of (amount)
with Credit Card (card number) that expires on (expiration date)”.
iii. A method named refundPayment that prints the message “Refunding payment of (amount)
with Credit Card (card number) that expires on (expiration date)”.
Use the following test class to test your code:
// Problem1.java
public class Problem1 {
public static void main(String[] args) {
PaymentGateway paypal =
new PayPal("john.doe@marist.edu", "password");
paypal.processPayment(100.00);
paypal.refundPayment(100.00);
PaymentGateway creditCard =
new CreditCard("1234567890123456", "12/2020");
creditCard.processPayment(100.00);
1
creditCard.refundPayment(100.00);
}
}
 */

public class problem1_9 {
    public static void main(String[] args) {
        PaymentGateway paypal = new PaymentGateway.PayPal("john.doe@marist.edu", "password");
        paypal.processPayment(100.00); //var1
        paypal.refundPayment(100.00);
        PaymentGateway creditCard = new PaymentGateway.CreditCard("1234567890123456", "12/2020");
        creditCard.processPayment(100.00);
        creditCard.refundPayment(100.00);
        /*
        PaymentGateway creditCard2 = new PaymentGateway.CreditCard("9876543210987654", "08/2024");
        creditCard2.processPayment(50.00);
        creditCard2.refundPayment(150.00);
         */
    }
}