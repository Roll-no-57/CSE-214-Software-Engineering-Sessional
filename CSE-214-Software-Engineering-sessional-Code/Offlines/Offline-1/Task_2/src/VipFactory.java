public class VipFactory extends BankFactory {
    @Override
    public Account createAccount() {
        return new VipAccount();
    }

    @Override
    public Loan createLoan() {
        return new VipLoan();
    }

}
