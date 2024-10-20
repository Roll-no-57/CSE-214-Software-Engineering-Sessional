public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        paypalCreator b = new paypalCreator();
        PaymentMethod p = b.createAccount();
        System.out.println(p.pay());
    }

}