public class bitcoinCreator extends paymentFactory{
    @Override
    public PaymentMethod createAccount(){

        return  new bitcoin();

    }
}
