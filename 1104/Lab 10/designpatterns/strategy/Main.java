public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart(400, "georgiana123");

        cart.setPaymentMenthod(new WireTransfer());
        cart.pay();
        System.out.println("Wire transfer was refused");
        cart.setPaymentMenthod(new PayPalService());
        cart.pay();
        System.out.println("PayPal verification failed, try again!");
        cart.setPaymentMenthod(new Cash());
        cart.pay();
        System.out.println("Thank you for your order!");
    }
}
