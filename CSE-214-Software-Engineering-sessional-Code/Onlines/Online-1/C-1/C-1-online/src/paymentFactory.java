public abstract class paymentFactory {
    public PaymentMethod paymoney(){
        PaymentMethod method = createAccount();
        method.pay();
        return method;
    }
    public abstract PaymentMethod createAccount();
}
