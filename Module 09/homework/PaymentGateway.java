//Andrew Masone

public abstract class PaymentGateway {

    public abstract void processPayment(double amount);

    public abstract void refundPayment(double amount);

    public static class PayPal extends PaymentGateway {
        private String email;
        private String password;

        public PayPal(String email, String password) {
            this.email = email;
            this.password = password;
        }


        public void processPayment(double amount) {
            System.out.println("Processing payment of " + amount + " with PayPal for account " + email);
        }


        public void refundPayment(double amount) {
            System.out.println("Refunding payment of " + amount + " with PayPal for account " + email);
        }
    }

    public static class CreditCard extends PaymentGateway {
        private String cardNumber;
        private String expirationDate;

        public CreditCard(String cardNumber, String expirationDate) {
            this.cardNumber = cardNumber;
            this.expirationDate = expirationDate;
        }

        public void processPayment(double amount) {
            System.out.println("Processing payment of " + amount + " with Credit Card " + cardNumber +
                    " that expires on " + expirationDate);
        }

        public void refundPayment(double amount) {
            System.out.println("Refunding payment of " + amount + " with Credit Card " + cardNumber +
                    " that expires on " + expirationDate);
        }
    }
}