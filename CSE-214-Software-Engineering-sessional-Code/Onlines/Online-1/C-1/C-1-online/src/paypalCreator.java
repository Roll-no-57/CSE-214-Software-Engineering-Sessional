public class paypalCreator extends paymentFactory{

    @Override
    public PaymentMethod createAccount(){
        return new paypal();
    }

}
