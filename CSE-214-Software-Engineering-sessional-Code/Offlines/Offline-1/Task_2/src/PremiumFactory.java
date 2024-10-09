public class PremiumFactory extends BankFactory {
    @Override
    public Account createAccount() {
        return new PremiumAccount();
    }

    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    }

}
