package Payment;

public class OnSpotPay implements Payment {
    @Override
    public void pay() {
        System.out.println("On spot payment is processing...");
    }
    public String toString() {
        return "OnSpotPay";
    }
}

