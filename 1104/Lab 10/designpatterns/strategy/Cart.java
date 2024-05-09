public class Cart {
    double amount;
    String accountUsername;

    IPayment paymentMenthod = null;

    public Cart(double amount, String accountUsername) {
        this.amount = amount;
        this.accountUsername = accountUsername;
    }

    public void setPaymentMenthod(IPayment paymentMenthod) {
        this.paymentMenthod = paymentMenthod;
    }

    public void pay() {
        if(paymentMenthod!=null) {
            this.paymentMenthod.pay(this.amount);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
